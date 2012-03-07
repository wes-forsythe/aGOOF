/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Player;

import Adventure.GameObject.*;
/**
 *
 * @author jeffj
 */
public final class Player extends GameObject {
    /**
 * Player class creates a Player object which extends from GameObject.
 * 
 * @author Tara Banks
 * @version 20120210-01 
 * @throws nothing
 */

    
    public static final Player INSTANCE = new Player(); // eager singleton creation
    /**
     * This declaration creates a new instance of a character/ player.
     */

    
    private Player() {
        super("Adventurer");
        //this.setPronoun("him");
        this.setDescription("There is nothing distinct about him, just average looking.");
    }
    
    @Override
    public String toString() {
        return "Player:"+super.toString();
    }
}