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
    public static Verb quit = new Verb("quit");
    public static Verb take = new Verb("take");
    public static Verb pluck = new Verb("pluck");
    /**
     * @see Adventure.GameParser.Verb
     */
    public static void Build() {
        Dictionary dict = Dictionary.INSTANCE;
        /**
         * Be sure to allow the user to use multiple synonyms of the verb
         * because no two people think exactly alike
         */
        dict.Register(quit, "q", "exit", "bye");
        dict.Register(take, "get", "pick up", "pickup");
        dict.Register(pluck, "pick", "pick down");
        /**
         * @see Adventure.GameParser.Word
         */
    }
}