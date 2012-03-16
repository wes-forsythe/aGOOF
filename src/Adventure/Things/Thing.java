/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Things;

import Adventure.GameObject.*;
/**
 * This class is the parent class for all the things in the game.  This will
 * include things such as a table, swords, lanterns, etc. 
 * 
 * @author jeffj
 */
public abstract class Thing extends GameObject {
    
    /**
     * Constructor for all things
     * @param name Proper name of the object
     */
    public Thing(String name) {
        super(name);
    }
    
    /*
     * @TODO Create list of properties using enums and ArrayList
     */
}