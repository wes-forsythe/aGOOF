/*
 * aGOOF - Adventure Game Object-Oriented Framework
 * 
 * package Locations contains locations of game objects
 */
package Adventure.Locations;

/**
 *
 * @author Keith Smith, jeffj
 */
public class Room extends Location {
    
    /**Room overload that places  name into protected variable
     * 
     * @param name
     */
    public Room(String name) {
        super(name);
    }
    /**
     * access method to protected string variable name
     * @return 
     * @see GameObject
     */
    @Override
    public String toString() {
        return "ROOM("+super.toString()+")";
    }
}
