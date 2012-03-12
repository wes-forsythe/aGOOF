/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.io.*;
import java.util.*;
import static Adventure.GameParser.Word.TokenType.*;
/** The Scanner class translates the character input stream, 'in' into 'Tokens'.
 * The Scanner also handles binding phrases together for multi-word verbs and nouns.
 *
 * @author Jeff Jenness
 */
public class Scanner {
    private PrintStream out;
    private BufferedReader in;
    private String prompt = "> ";
    private String buff;

    public Scanner() {
        this.out = new PrintStream(System.out);
        this.in  = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public void setOutput(OutputStream out) {
        this.out = new PrintStream(out);
    }
    
    public void setInput(InputStream in) {
        this.in = new BufferedReader(new InputStreamReader(in));
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
    
    public String getBuffer() {
        return buff.toString();
    }
    
    public ArrayList<Token> scan() throws IOException {
        /*
         * @TODO add adjectives to input, right now adjectives are not processed
         * @TODO allow possessives to be a part of the input
         * @TODO allow the scanner to separate and recognize punctuation
         * @TODO allow the scanner to recognize quotes and combine into strings
         */
        Dictionary dict = Dictionary.INSTANCE;
        ArrayList<String> words;
        Definition def;
        Token tok;
        ArrayList<Token> tokens = new ArrayList<Token>();
        
        if (prompt != null)
            out.printf(prompt);
        buff = in.readLine();
        
        words = new ArrayList(Arrays.asList(buff.split("\\s+")));
        
        // check all words and form dictionary entries (multi-words, e.g., "pick up")
        for(int i=0; i<words.size(); ++i) {
            System.out.printf("Processing word: '%s'\n", words.get(i));
            tok = new Token(words.get(i), words.get(i), UNKNOWN);
            if ((def = dict.lookup(words.get(i))) != null) {
                if (def.word().type() != PARTIAL)
                    tok = new Token(words.get(i), def.word().get(), def.word().type());
                if (def.phrases() != null) {
                    // match a phrase on the buffer - GREEDY (which is good), BRUTISH and WASTEFUL!
                    // @TODO Redesign multi-word search algorithm.  Works but very unelegant.
                    int n = 0; // number of words in longest match
                    String match = def.word().get(); // default to entry but grab longest matching phrase
                    StringBuffer phrase = new StringBuffer(words.get(i));
                    int j;
                    for (j=1; i+j < words.size(); ++j) { // index to next work to grab from buffer
                        phrase.append(" ").append(words.get(i+j));
                        if (def.phrases().contains(phrase.toString().toLowerCase())) {
                            n = j;
                            match = phrase.toString();
                            System.out.printf("Found match: %d words, '%s' phrase\n", n, match);
                        }
                    }
                    if (n != 0) {
                        def = dict.lookup(match.toLowerCase());
                        tok = new Token(match, def.word().get(), def.word().type());
                        i += n;
                        System.out.printf("Next word in buffer %d: '%s'\n", i, words.get(i));
                    }
                }
            }
            tokens.add(tok);
        }
        
        return tokens;
    }
}