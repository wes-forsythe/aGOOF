/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.util.*;
import static Adventure.GameParser.Word.PartsOfSpeech.*;
/**
 *
 * @author Jeff Jenness 
 */
public enum Dictionary {
    INSTANCE;
    
    private HashMap<String,Definition> entries;
    
    private Dictionary() {
        entries = new HashMap<String,Definition>();
    }
    
    public void addWord(String entry, Definition def) {
        // @TODO throw exception when an entry is already found in dictionary
        if (entries.get(entry) != null)
            entries.put(entry, def);
        
    }
    
    public void addAliases(Word word, String ... aliases) {
        int i;
        for (String alias : aliases) {
            String entry = alias.toLowerCase();
            // @TODO throw exception when an entry is already found in dictionary
            if (entries.get(entry) != null)
                entries.put(entry, new Definition(word));
            if ((i=entry.indexOf(" ")) > 0) {
                String partial = entry.substring(0,i);
                if (entries.get(partial) == null)
                    entries.put(partial, new Definition(new Word(partial, PARTIAL), entry));
                else
                    entries.get(partial).addPhrase(entry);
            }
        }
    }

    public Definition lookup(String word) {
        return entries.get(word.toLowerCase());
    }
}