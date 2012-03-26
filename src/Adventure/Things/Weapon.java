/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Things;

/**
 *
 * @author Price Hardin
 */
public class Weapon extends Item {
    
    /**
     * Constructor for a Weapon Item.  Passes up the Proper name and any
     * aliases it may have.
     * 
     * REVISE
     * 
     * For now aliases has been removed, due to ambiguity it causes in the 
     * parse tree.
     * 
     * @param fullName the Proper name of the Weapon.
     */
    public Weapon(String fullName/*, String ... aliases*/){
        super(fullName);
        
        /**
         * To be used when ambiguity is fixed.
         * addAliases(aliases);
         */
    }
    
    // @TODO Add properites.
    
}
