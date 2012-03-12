/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import Adventure.GameObject.*;
import static Adventure.GameParser.Word.TokenType.*;
/**
 *
 * @author jeffj
 */
public class Parser {
    private InputStream in = System.in;
    private PrintStream out = System.out;
    ArrayList<Token> words;
    int current;
    private Scanner scanner;
    Action action;
    
    public Parser() {
        this.scanner = new Scanner();
    }
    
    public void setInput(InputStream in) {
        this.in = in;
    }
    
    public void setOutput(PrintStream out) {
        this.out = out;
    }
    
    /*
     * @TODO allow multiple sentences for input
     * @TODO allow ambiguous grammars, i.e., multiple rule matches
     * @TODO redesign to use AST's and interpret
     */
    public Action parse() throws IOException {
        
        scanner.setInput(in);
        scanner.setOutput(out);
        
        words = scanner.scan();
        current = 0;
        for (int i=0; i<words.size(); ++i) 
            System.out.printf("lexeme->%s, value->%s, token->%s\n", 
                words.get(i).lexeme(), words.get(i).value(), words.get(i).type());
        action = new Action();
        start();
        System.out.printf(action.toString()+"\n");
        return action;
    }
    
    private void start() {
        sentence();
    }
    
    private void sentence() {
        if (current < words.size() && words.get(current).type() == NOUN) {
            action.setSubject(words.get(current).value());
            ++current;
            if (current < words.size() && words.get(current).lexeme().equals(","))
                ++current;
        } else
            action.setSubject("player");
        if (current < words.size() && words.get(current).type() == VERB) {
            action.setAction(words.get(current).value());
            ++current;
            if (current < words.size() && words.get(current).type() == ARTICLE)
                ++current;
            if (current < words.size() && words.get(current).type() == NOUN) {
                action.setDObject(words.get(current).value());
                ++current;
                if (current < words.size() && words.get(current).type() == PREPOSITION) {
                    ++current;
                    if (current < words.size() && words.get(current).type() == NOUN)
                        action.setIObject(words.get(current++).value());
                    else
                        action.setError("Sorry, I don't understand how to "+
                                action.Action()+" that.");
                }
            }
        } else if (current < words.size() && words.get(current).type() == UNKNOWN) {
            action.setError("I don't recognize the word '"+words.get(current).lexeme()+"'.");
        } else
            action.setError("I'm sorry but I don't understand starting at '"
                    +words.get(current).lexeme()+"'.");
    }
}