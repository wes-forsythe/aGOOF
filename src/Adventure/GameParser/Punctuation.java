/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import static Adventure.GameParser.Word.TokenType.*;
/**
 *
 * @author jeffj
 */
public class Punctuation extends Word {
    
    public Punctuation(String word) {
        super(word, PUNCTUATION);
    }
    
    /**
     * Returns an output of the word by calling the <code> toString() </code>
     * function of the parent function <code> Word </code>.
     * 
     * @return text and result of parent function call
     */

    @Override
    public String toString() {
        return "PUNC("+super.toString()+")";
    }
}
