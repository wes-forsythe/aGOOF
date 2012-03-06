/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.util.ArrayList;
/**
 *
 * @author jeffj
 * 
 * @todo Check logic to make sure words are all lowercase, make efficient
 */
public class Word {
    public static enum PartsOfSpeech {
        UNKNOWN, PARTIAL, NOUN, ARTICLE, ADJECTIVE, VERB, PREPOSITION, INTERJECTION
    }

    private String entry;
    private PartsOfSpeech type;
    private String word;
    
    public Word(String word, PartsOfSpeech type) {
        this.entry = word.toLowerCase();
        this.type = type;
        this.word = word;
    }
    
     /**
     * Retrieves the <code> word </code> typed by the user, so that it can
     * be used in other functions.
     * 
     * @return the archetype stored in Dictionary.java file that corresponds
     * to the set archetype from the Word() function
     */
    
    public String get() {
        return this.word;
    }
    
    /**
     * Allows for comparison between the user's typed <code> word </code> 
     * and the list of words stored within the program.
     * 
     * @param word a <code> String </code> containing the <code> word </code>
     * typed by the user
     * 
     * @return <code> boolean </code> value to determine if typed word
     * matches any in the Dictionary.java file
     */
    
    public PartsOfSpeech type() {
        return this.type;
    }
    
    public String entry() {
        return this.entry;
    }
    
    /**
     * Overloads the <code> toString() </code> function so that it performs
     * an action that it would not do otherwise, which is return the
     * <code> archetype </code> for a particular word
     * 
     * @return the <code> word </code> typed by the user saved as an
     * <code> archetype </code>
     */
    
    @Override
    public String toString() {
        return this.type+"("+this.word+"("+this.entry+"))";
    }
}
