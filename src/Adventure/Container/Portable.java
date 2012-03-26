/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Container;

/**
 * @author Julie Kirby
 * @author Wes Forsythe
 * 
 * This interface extends Container by maintaining attributes for portable containers.
 */

public interface Portable implements Container {
    
}
 
//public class Portable extends Container {
//    private boolean droppable;
//    private bool ean inTransit;
//    protected int maxItems;
//    
//    public boolean getDroppable()
//    {
//        /**
//         * returns whether container is droppable or not
//         */
//        return droppable;
//    }
//    
//    private void setDroppable(boolean value)
//    {
//        /**
//         * sets value for droppability of container
//         */
//         droppable = value;
//    }
//    
//    public boolean getTransitState()
//    {
//        /**
//         * returns whether or not object is in transit (on Player/Creature)
//         */
//         return inTransit;
//    }
//    
//    private void setTransitState(boolean value)
//    {
//        /**
//         * sets current transit state of container
//         */
//         inTransit = value;
//    }
//    
//    public int getMaxItems()
//    {
//        /**
//         * return max allowable inventory items of container
//         */
//         return maxItems;
//    }
//};