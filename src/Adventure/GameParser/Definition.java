/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.util.*;
/**
 *
 * @author jeffj
 * 
 * @TODO ambiguity was chosen to be eliminated in this version, 
 *       so each word can only be used for one part of speech,
 *       add this into the next version of the dictionary/scanner
 */
public class Definition {
    private Word word;
    private ArrayList<String> phrases; // phrases starting with the word
    
    public Definition(Word word) {
        this.word = word;
        phrases = null;
    }
    
    public Definition(Word word, String phrase) {
        this.word = word;
        phrases = new ArrayList<String>();
        phrases.add(phrase);
    }
    
    public Word word() {
        return this.word;
    }
    
    public void addPhrase(String ... compounds) {
        if (phrases == null) phrases = new ArrayList<String>();
        phrases.addAll(Arrays.asList(compounds));
    }
    
    public ArrayList<String> phrases() {
        return phrases;
    }
    
    @Override
    public String toString() {
        return "DEF("+word.toString()+"{"+phrases.toString()+"})";
    }
 }
