/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import static Adventure.GameParser.Word.PartsOfSpeech;
/**
 *
 * @author jeffj
 */
public class Token {
    private String lexeme;
    private String value;
    private PartsOfSpeech type;
    
    public Token(String lexeme, String value, PartsOfSpeech type) {
        this.lexeme = lexeme;
        this.value = value;
        this.type = type;
    }
    
    public String lexeme() {
        return this.lexeme;
    }
    
    public String value() {
        return this.value;
    }
    
    public PartsOfSpeech type() {
        return this.type;
    }
    
}
