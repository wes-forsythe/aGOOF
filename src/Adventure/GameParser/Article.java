/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import static Adventure.GameParser.Word.PartsOfSpeech.*;
/**
 *
 * @author jeffj, kevinratton
 */
public class Article extends Word {
    /**
     * gets private string word to set type article
     * @param word string to set type
     */
    public Article(String word) {
        super(word, ARTICLE);
    }
    /**
     * calls Word toString() method
     * @return 
     */
    @Override
    public String toString() {
        return "AOBJ("+super.toString()+")";
    }
}
