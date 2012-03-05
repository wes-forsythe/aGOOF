/*
 * aGOOF - Adventure Game Object-Oriented Framework
 * 
 * package Locations contains locations of game objects
 */
package Adventure.Locations;

import Adventure.GameObject.*;
/**Location contains the name of a particular location.
 *
 * @author Keith Smith, jeffj
 */
public abstract class Location extends GameObject {
     /**
     * Location places name into protected variable.
     * @param name
     */   
    public Location(String name) {
        super(name);
    }   
     /**
     * access method to protected string variable name
     * @return 
     * @see GameObject
     */   
    @Override
    public String toString() {
        return this.name;
    }
}