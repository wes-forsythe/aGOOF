/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.util.ArrayList;

/**
 * Contains all the functionality of all the subclasses that are
 * grouped along with Word, such as Verb and Preposition.
 * 
 * @author jeffj
 * @author dustin.sharp
 * 
 * @todo Check logic to make sure words are all lowercase, make efficient
 * 
 * @version 20120503-01
 */

public class Word {
    /**
     * Contains the names of all the different types of words available
     * in this class while the types that don't fit these descriptions
     * being given the name UNKNOWN.
     */
    
    public static enum PartsOfSpeech {
        UNKNOWN, PARTIAL, NOUN, ARTICLE, ADJECTIVE, VERB, PREPOSITION, INTERJECTION
    }

    private String entry;
    private PartsOfSpeech type;
    private String word;
    
    /**
     * Sets up an instance of this class and assigns parameters to
     * created values within this class.
     * 
     * @param word String containing the word passed from a subclass
     * @param type Contains one of the names from the PartsOfSpeech
     * enum created above
     */
    
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
     * Allows the type for a given word to be accessed by other objects.
     * 
     * @return type name from PartsOfSpeech for a particular word
     */
    
    public PartsOfSpeech type() {
        return this.type;
    }
    
    /**
     * Allows access to the lowercase version of the word that has
     * been placed in the dictionary.
     * 
     * @return created entry based on lowercase version of given word
     */
    
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
