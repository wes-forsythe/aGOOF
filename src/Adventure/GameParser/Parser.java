/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
/**
 *
 * @author jeffj
 * @author dereke
 * @verson ?
 */

/** @see parse() */
public class Parser {

    private InputStream in = System.in;
    private PrintStream out = System.out;
    private Scanner scanner;
    
    /** Start the Scanner  */
    public Parser() {
        this.scanner = new Scanner();
    }
    
    /** Changes the InputStream that the user has typed. 
     * 
     * 
     * @param in InputStream that should be the new in stream for the scanner in parse()
     * 
     */
    public void setInput(InputStream in) {
        this.in = in;
    }
    
    /** Changes the OutputStream. 
     * 
     * 
     * @param out OutputStream that should be the new print stream
     * 
     */
    public void setOutput(PrintStream out) {
        this.out = out;
    }
    
    
    /**   
     *  Scan the words or characters from the user and parse.
     *  Put the words in an ArrayList and scan them. 
     * 
     * @see Scanner
     * @see Action
     * @return parse   returns the new Action to do: parse
     * @throws IOException  

     * @TODO allow ambiguous grammars, i.e., multiple rule matches
     */
    public Action parse() throws IOException {
        Action parse = new Action();
        ArrayList<Token> words;
        
        scanner.setInput(in);
        scanner.setOutput(out);
        
        words = scanner.scan();
        for (int i=0; i<words.size(); ++i) 
            System.out.printf("lexeme->%s, value->%s, token->%s\n", 
                words.get(i).lexeme(), words.get(i).value(), words.get(i).type());
        parse.setAction(words.get(0).value());
        
        return parse;
    }
}