/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

/** A creature that is hostile toward the player.
 * 
 *
 * @author jeffj, wesf
 * @version 20120305-01
 */
public class Monster extends Creature {
    /**Constructor passes name to the parent Creature
     *@param name the name of the particular monster
     */
    public Monster(String name) {
        super(name);
        this.movement = new Aggressive(this);
    }
    
    /**Allows the parent class to know what kind of creature it is*/
    @Override
    public String toString() {
        return "MONSTER("+super.toString()+")";
    }
}
