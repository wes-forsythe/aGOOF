/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameBuild;

import Adventure.Things.*;
/**
 * For building all the items, fixtures that accessorize the game
 * 
 * @see Adventure.Things.Weapon
 * @see Adventure.Things.Fixture
 * 
 * @author Chris Jones, jeffj
 * 
 * @version 20120305-01
 * 
 * @TODO Finish building the class and it's methods
 */
public class Props {
    
    /** A bloody axe weapon, aliases removed for now */
    public static Weapon bloodyAxe = new Weapon ("Bloody Axe"/*, "Axe", "Ax"*/);
    /** A knife weapon */
    public static Weapon knife = new Weapon ("knife");
    /** A radio fixture */
    public static Fixture radio = new Fixture("radio");
    
    /**
     * For adding attributes and other things to the objects
     * 
     * @TODO Finish this method and also object methods outside of this class
     */
    public static void Build() {

        //knife.addAliases("blade", "dagger");
    
    }
}
