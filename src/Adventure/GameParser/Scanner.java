/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.io.*;
import java.util.*;
import static Adventure.GameParser.Word.PartsOfSpeech.*;
/**
 *
 * @author jeffj
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
         * @TODO allow possessives to be a part of the input
         * @TODO multi-word recognition, e.g., "pick up", "put down", should be greedy - FIX
         */
        Dictionary dict = Dictionary.INSTANCE;
        ArrayList<String> words;
        Definition def;
        ArrayList<Token> tokens = new ArrayList<Token>();
        
        if (prompt != null)
            out.printf(prompt);
        buff = in.readLine();
        
        words = new ArrayList(Arrays.asList(buff.split("\\s+")));
        
        // check all words and form dictionary entries (multi-words, e.g., "pick up")
        for(int i=0; i<words.size(); ++i) {
            if ((def = dict.lookup(words.get(i))) != null) {
                tokens.add(new Token(words.get(i), def.word().get(), def.word().type()));
            } else {
                tokens.add(new Token(words.get(i), words.get(i), UNKNOWN));
            }
        }
        
        return tokens;
    }
}