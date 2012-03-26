/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Things;

/**
 * Consumable will contain items that when used would be removed from the
 * person.  Items such as food and potions will be consumables.
 * 
 * @author matthew.hardin
 */
public class Consumable extends Item{
    /**
     * Constructor for Consumables, passes fullName up to its 
     * parent class (Item).
     * 
     * @param fullName Proper name of the Consumable
     */
    public Consumable (String fullName/*, String ... aliases*/){
        super (fullName);
        // addAliases(aliases);
    }
    
}
