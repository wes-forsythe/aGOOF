/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

/**
 *
 * @author jeffj
 * @author dustin.sharp
 */
public class Preposition extends Word {
    
    /**
     * Sets up an instance of the word typed by the user and
     * passes it to the super class <code> Word </code> to be
     * dealt with.
     * 
     * @param word String containing the word that the user
     * typed.
     */
    
    public Preposition(String word) {
        super(word);
    }
    
    /**
     * Returns an output of the word by calling the <code> toString() </code>
     * function of the parent function <code> Word </code>.
     * 
     * @return text and result of parent function call
     */

    @Override
    public String toString() {
        return "PREPOSITION("+super.toString()+")";
    }
}
