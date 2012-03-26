/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import static Adventure.GameParser.Word.TokenType.*;
/**
 * Verb is a subclass of Word that deals with verbs that are contained
 * in the dictionary and that are used in the parser
 * 
 * @author jeffj
 * @author dustin.sharp
 * 
 * @version 20120503-01
 */
public class Verb extends Word {
    
    /**
     * Sets up an instance of a <code> word </code> that the user has typed
     * and passes it to the <code> Word </code> parent class to be parsed
     * by the dictionary.
     * 
     * @param word a String containing the word typed by the user
     */
    
    public Verb(String word) {
        super(word, VERB);
    }
    
    /**
     * Returns an output of the word by calling the <code> toString() </code>
     * function of the parent function <code> Word </code>.
     * 
     * @return text and result of parent function call
     */

    @Override
    public String toString() {
        return "VOBJ("+super.toString()+")";
    }
}
