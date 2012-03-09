/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Container;

/**
 * @author Julie Kirby
 * @author Wes Forsythe
 * 
 * This class gives an extension to Container for stationary objects that can be
 * closed and/or locked (and open and/or unlocked)
 */
public class Stationary extends Container {
    private char locked;    /** holds whether or not container is locked */
    private char closed;    /** holds whether or not container is closed */
    
    public char getLocked()
    {
        return locked;  /** returned lock status of container*/
    }
    
    protected void setLocked(char value)
    {
        locked = value; /** sets lock status of container */
    }
    
    public char getClosed()
    {
        return closed;  /** returned open/closed status of container*/
    }
    
    protected void setClosed(char value)
    {
        closed = value;  /** sets open/closed status of container*/
    }
}