/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import static Adventure.GameParser.Word.TokenType;
/**
 *
 * @author jeffj
 */
public class Token {
    private String lexeme;
    private String value;
    private TokenType type;
    
    public Token(String lexeme, String value, TokenType type) {
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
    
    public TokenType type() {
        return this.type;
    }
    
}
