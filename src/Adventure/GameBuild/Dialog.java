/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package Adventure.GameBuild;

import Adventure.Adventure;
import Adventure.GameParser.*;
/** 
 * @see Adventure.GameBuild
 * @see Adventure.Adventure
 */

/**
 * This class is for building vocabulary and rules used in the parser
 * 
 * @author Jeff Jenness
 * @author Julie Kirby
 * 
 * @version 20120305-01
 */
public class Dialog {
    /**
     * Verbs denote actions, so decide on the action and
     * declare it as a verb so it can be parsed
     */
    public static Punctuation comma = new Punctuation(",");
    public static Article the = new Article("the");
    public static Article a = new Article("a");
    public static Preposition to = new Preposition("to");
    public static Preposition with = new Preposition("with");
    
    public static Verb quit = new Verb("quit");
    public static Verb take = new Verb("take");
    public static Verb kill = new Verb("kill");
    
    /**
     * @see Adventure.GameParser.Verb
     */
    public static void Build() {
        Dictionary dict = Dictionary.INSTANCE;
        /**
         * Be sure to allow the user to use multiple synonyms of the verb
         * because no two people think exactly alike
         */
        dict.Register(comma);
        dict.Register(the);
        dict.Register(a);
        dict.Register(to);
        dict.Register(with);
        
        dict.Register(quit, "q", "exit", "bye");
        dict.Register(take, "get", "pick up", "pickup");
        dict.Register(kill, "fight");
        /**
         * @see Adventure.GameParser.Word
         */
    }
}