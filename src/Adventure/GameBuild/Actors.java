/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameBuild;

import java.util.ArrayList;
import Adventure.Creatures.*;
import static Adventure.GameBuild.Scenes.*;
import Adventure.GameEngine.*;

/**
 * For building NPC's used in game interaction
 * 
 * @see Monster
 * @see Rabble
 * @see Sidekick
 * @see ClockWatcher
 *  
 * @author Chris Jones, jeffj
 * 
 * @version 20120305-01
 */
public class Actors {
    
    /**A monster named Boris */
    public static Monster Boris = new Monster("Boris");
    /**A rabble named Frank */
    public static Rabble Frank = new Rabble("Frank");
    /**A sidekick named Robin */
    public static Sidekick Robin = new Sidekick("Robin");
    
    /**
     * Initializes locations/movements for the actors in the game<br>
     * Also adds these actors to the world
     * 
     * @see Monster#setLocation(Adventure.Locations.Location) 
     * @see Rabble#setLocation(Adventure.Locations.Location) 
     * @see Rabble#setMovement(Adventure.Creatures.MoveAction) 
     * @see World#addActor(Adventure.Creatures.Creature) 
     * @see Engine#subscribe(Adventure.Creatures.ClockWatcher)
     * 
     */
    public static void Build() {
        
        Boris.setLocation(Cave);
        World.addActor(Boris);
        
        Frank.setLocation(Cave);
        Frank.setMovement(new Random(Frank));
        World.addActor(Frank);
        
        Robin.setLocation(Outside);
        World.addActor(Robin);
        
        
        Engine e = Engine.INSTANCE;
        for (ClockWatcher w : World.actors)
            e.subscribe(w);
    
    }
}
