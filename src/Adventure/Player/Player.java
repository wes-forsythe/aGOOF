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
    
    public static final Player INSTANCE = new Player(); // eager singleton creation
    
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