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
    
    public String get() {
        return this.word;
    }
    
    public PartsOfSpeech type() {
        return this.type;
    }
    
    public String entry() {
        return this.entry;
    }
    
    @Override
    public String toString() {
        return this.type+"("+this.word+"("+this.entry+"))";
    }
}