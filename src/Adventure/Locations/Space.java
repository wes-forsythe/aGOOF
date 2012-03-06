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
public class Space extends Location {
    
    /** Space override to place the name into protected variable
     * 
     * @param name
     */
    public Space(String name) {
        super(name);
    }
    /**
     * access method to protected string variable name
     * @return 
     * @see GameObject
     */   
    @Override
    public String toString() {
        return "SPACE("+super.toString()+")";
    }
}