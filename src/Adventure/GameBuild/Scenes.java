/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package Adventure.GameBuild;

import java.util.ArrayList;
import Adventure.Locations.*;
/**
 * @see Adventure.GameBuild
 */


/**
 * This class is for building all the locations and the map
 * 
 * @author Jeff Jenness
 * @author Julie Kirby
 * 
 * @version 20120305-01
 */
public class Scenes {
        
    /**
     * First, determine whether the new location is to be an outside space, 
     * or a room. Then declare new Space or Room based on specification.
     */
    public static Location Outside = new Space("Outside");
    public static Location Cave = new Room("Cave");
    /**
    * @see Adventure.Locations.Space
    * @see Adventure.Locations.Room
    */
    
    /**
     * The following method actually adds the new Space or Room to the World.
     */
    public static void Build() {
        /**
         * @see Adventure.GameBuild.World
         */
        World.addScene(Outside);
        World.addScene(Cave);
        
    }
}