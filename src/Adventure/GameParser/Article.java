/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import static Adventure.GameParser.Word.PartsOfSpeech.*;
/**
 *
 * @author jeffj
 */
public class Article extends Word {
    public Article(String word) {
        super(word, ARTICLE);
    }

    @Override
    public String toString() {
        return "AOBJ("+super.toString()+")";
    }
}
