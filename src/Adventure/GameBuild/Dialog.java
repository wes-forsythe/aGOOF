/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameBuild;

import Adventure.GameParser.*;

/**
 * For building vocabulary and rules used in the parser
 * 
 * @author jeffj
 */
public class Dialog {
    
    public static Verb quit = new Verb("quit");
    public static Verb take = new Verb("take");
    
    public static void Build() {
        Dictionary dict = Dictionary.INSTANCE;
        
        dict.addAliases(quit, "exit");
        dict.addAliases(take, "get", "pick up", "pickup", "steal");
    
    }
}
