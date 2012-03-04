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
public class Verb extends Word {
    public Verb(String word) {
        super(word, VERB);
    }

    @Override
    public String toString() {
        return "VOBJ("+super.toString()+")";
    }
}
