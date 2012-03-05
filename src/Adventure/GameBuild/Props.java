/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameBuild;

import Adventure.Things.*;
/**
 * For building all the items, fixtures that accessorize the game
 * 
 * @author jeffj
 */
public class Props {
    
    public static Weapon bloodyAxe = new Weapon ("Bloody Axe", "Axe", "Ax");
    public static Weapon knife = new Weapon ("knife");
    public static Fixture radio = new Fixture("radio");
    
    public static void Build() {

        //knife.addAliases("blade", "dagger");
    
    }
}
