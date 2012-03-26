/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Things;

/**
 * This class will contain all the items in the game, such as potions, swords,
 * leaflets, notes, flashlight, etc.
 * 
 * @author jeffj
 */
public class Item extends Thing {
    /**
     * Constructor for Item, sends the Proper name up the class hierarchy
     * (to Thing).
     * @param name Proper name of the Item. 
     */
    public Item(String name) {
        super(name);
    }
    
}
