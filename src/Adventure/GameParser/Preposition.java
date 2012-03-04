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
public class Preposition extends Word {
    public Preposition(String word) {
        super(word, PREPOSITION);
    }

    @Override
    public String toString() {
        return "POBJ("+super.toString()+")";
    }
}
