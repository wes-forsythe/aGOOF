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
public class Verb extends Word {
    
    /**
     * Sets up an instance of a <code> word </code> that the user has typed
     * and passes it to the <code> Word </code> parent class to be parsed
     * by the dictionary.
     * 
     * @param word a String containing the word typed by the user
     */
    
    public Verb(String word) {
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
        return "VERB("+super.toString()+")";
    }
}
