/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

/** A MoveAction that causes the said creature to move agressively
 * 
 *
 * @author jeffj, wesf
 * @version 20120305-01
 */
public class Aggressive extends MoveAction {
    /**Constructor passes the caller to the parent class MoveAction
     *@param caller   tells what object called this MoveAction
     */
    public Aggressive(Object caller) {
        super(caller);
    }
    
    /**passes how the creature is moving to the parent MoveAction
     * so that it knows its behavior
     */
    @Override
    public String toString() {
        return "MOVE(Aggressive)";
    }
}
