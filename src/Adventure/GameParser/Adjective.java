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
public class Adjective extends Word {
    public Adjective(String word) {
        super(word, ADJECTIVE);
    }

    @Override
    public String toString() {
        return "ADOBJ("+super.toString()+")";
    }    
}
