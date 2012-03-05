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

/**
 * 
 * @author dustin.sharp
 * 
 * This Java file contains the abstract class of the other word type files in
 * the program.  The file has all the methods and variables that are in
 * common with the word type files.  Word type files include Noun.java,
 * Preposition.java, Article.java, and so on.  The particular word passed
 * to Word.java from other word type files is analyzed and compared to
 * words contained in the Dictionary.java word list to determine the action
 * tied to a given word.
 * 
 */

public abstract class Word {
    private String archetype;
    private ArrayList<String> aliases;
    
    /**
     * Sets up an instance of the <code> Word </code> class
     * and initializes the archetype variable to be the lowercase version
     * of the word typed by the user. An <code> aliases </code> variable is
     * set up so that alternate words with the same meaning as the 
     * <code> word </code> parameter can be added to the list of aliases
     * for this word.
     * 
     * @param word a String containing the word typed by user
     */
    
    public Word(String word) {
        this.archetype = word.toLowerCase();
        this.aliases = new ArrayList<String>();
        this.aliases.add(word);
    }
    
     /**
     * Retrieves the <code> word </code> typed by the user, so that it can
     * be used in other functions.
     * 
     * @return the archetype stored in Dictionary.java file that corresponds
     * to the set archetype from the Word() function
     */
    
    public String get() {
        return this.archetype;
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
    
    public boolean matches(String word) {
        boolean result = this.archetype.equals(word);
        
        for(int i=0; !result && i<this.aliases.size(); ++i)
            if (aliases.get(i).equals(word))
                result = true;
            
        return result;
    }
    
    /**
     * Simple "get" function that retrieves a list of aliases when called
     * 
     * @return a list of aliases for a given word
     */
    
    public ArrayList<String> aliases() {
        return this.aliases;
    }
    
    /**
     * Adds any <code> aliases </code> a word may have. For
     * example, if there is the given word "knife", the alias "blade" can be
     * added to the alias list so that the user can use these two words
     * interchangeably.
     * 
     * @param aliases <code> String </code> containing an alternate word
     * with same meaning as a particular given word
     * 
     * @return a boolean that determines if the alias has been added correctly
     */
    
    public void addAliases(String ... aliases) {
        Dictionary dict = Dictionary.INSTANCE;
        dict.addWord(this.archetype,this); // FIX THIS
        for (String alias: aliases) {
            alias = alias.toLowerCase();
            this.aliases.add(alias);
            dict.addWord(alias, this);
        }
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
        return archetype;
    }
}