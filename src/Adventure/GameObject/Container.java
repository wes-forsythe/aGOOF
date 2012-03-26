/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameObject;

import Adventure.Things.*;
import Adventure.Locations.Location;
import java.util.ArrayList;

/**
 *
 * @author Julie Kirby
 * @author Wes Forsythe
 * 
 * This interface is implemented by GameObject. 
 * Methods will return information about a GameObject that is also a Container.
 * Examples: player, room, creature, bag, box, treasure chest, etc.
 */
public interface Container {
    /**
     * max inventory weight allowable (get/set) -- ???
     */
    boolean getMaxWeight();
    void setMaxWeight(GameObject g1);
    /**
     * max inventory items allowable -- ???
     */
    boolean getMaxItems();
    void setMaxItems(GameObject g1);
    /**
     * show current inventory/item list 
     */
    ArrayList<Thing> getCurrInv();
    void alterInv(GameObject g1);
    /**
     * whether or not is droppable
     */
    boolean getDropState();
    void setDropState(GameObject g1);
    /**
     * whether or not is lockable
     */
    boolean getLockState();
    void setLockState(GameObject g1);
    /**
     * whether or not is closeable
     */
    boolean getCloseState();
    void setCloseState(GameObject g1);
}
