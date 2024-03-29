/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.util.*;
import static Adventure.GameParser.Word.TokenType.*;
/**
 *
 * @author Jeff Jenness, kevinratton
 */
public enum Dictionary {
    INSTANCE;
    
    private HashMap<String,Definition> entries;
    /**
     * make new HashMap called entries
     */
    private Dictionary() {
        entries = new HashMap<String,Definition>();
    }
    /**
     * add word to dictionary with param word
     * @param word word to be added
     */
    public void addWord(Word word) {
        this.addWord(word.entry(), new Definition(word));
    }
    /**
     * takes string and definition parameters to add to dictionary
     * @param entry string to add to dictionary
     * @param def definition of entry
     */
    public void addWord(String entry, Definition def) {
        // @TODO throw exception when an entry is already found in dictionary
        if (!entries.containsKey(entry)) { // adding the entry the first time
            System.out.printf("Adding word to dictionary: '%s'->'%s'\n", entry, def.word().get());
            entries.put(entry, def);
        } else if (entries.get(entry).word().type() == PARTIAL) { // if only PARTIAL before, then add a legitimate word the first time we see it
            System.out.printf("Adding word to dictionary: '%s'->'%s'\n", entry, def.word().get());
            entries.get(entry).resetWord(def.word());
        }

        if (entry.indexOf(" ") > 0) // for any phrase, add PARTIALs
            this.addPhrase(entry);
    }
    /**
     * takes Word and String of aliases to have an entry and its possible
     * aliases
     * @param word word to be added
     * @param aliases possible other names used
     */
    public void addAliases(Word word, String ... aliases) {
        int i;
        for (String alias : aliases) {
            String entry = alias.toLowerCase();
            this.addWord(entry, new Definition(word));
        }
    }
    /**
     * adds phrases to dictionary with string phrase param
     * @param phrase 
     */
    public void addPhrase(String phrase) {
        int i;
        if ((i=phrase.indexOf(" ")) > 0) {
            // @TODO take care in adding phrases ... must be lowercase and only
            // one space between words, need to rebuild phrases to be sure.
            String partial = phrase.substring(0,i);
            if (!entries.containsKey(partial)) {
                System.out.printf("Adding partial to dictionary: '%s'->'%s'\n", partial, phrase);
                entries.put(partial, new Definition(new Word(partial, PARTIAL), phrase));
            } else {
                System.out.printf("Adding phrase to dictionary: '%s'->'%s'\n", partial, phrase);
                entries.get(partial).addPhrase(phrase);
            }
        }        
    }
    /**
     * takes word and aliases to add to dictionary
     * @param word word to add
     * @param aliases other names available
     */
    public void Register(Word word, String ... aliases) {
        this.addWord(word);
        this.addAliases(word, aliases);
    }
    /**
     * get definition of a word
     * @param word word for lookup
     * @return 
     */
    public Definition lookup(String word) {
        return entries.get(word.toLowerCase());
    }
}