/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

import Adventure.GameObject.*;
import Adventure.Locations.*;
/**
 * Serves as a basis for monster, rabble, etc.
 * 
 *
 * @author jeffj, wesf
 * @version 20120305-01
 */
public abstract class Creature extends GameObject implements ClockWatcher {
    
    /**creates a moveAction that is based on a particular creature*/
    protected MoveAction movement;
    
    /**creates a Location based on a particular creature*/
    protected Location location;
    
    /**Constructor passes the name of the creature to GameObject
     *@param name   The name of the specific creature
     */
    public Creature(String name) {
        super(name);
    }
    
    /**listens to the watcher, tocks on the tick*/
    @Override
    public void tock() {
        this.movement.move();
    }
    
    /**changes the movement of the creature
     *@param movement  the type of movement to be assigned
     */
    public void setMovement(MoveAction movement) {
        this.movement = movement;
    }
    
    /**changes the location of the creature
     *@param location  the location the creature will be assigned to
     */
    public void setLocation(Location location) {
        this.location = location;
    }
    
    /**Displays the creatures name, movement type, and location*/
    @Override
    public String toString() {
        return this.name+","+this.movement+","+this.location;
    }
}
