/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameBuild;

import Adventure.GameEngine.Master;
import java.util.ArrayList;
import Adventure.Player.*;
import Adventure.Creatures.*;
import Adventure.Locations.*;
import Adventure.GameParser.*;

/**
 * @see Adventure.GameBuild
 * @see Adventure.GameEngine.Master
 */


/**
 * The purpose of this class is to build the entire world of the game
 * 
 * @author Jeff Jenness
 * @author Julie Kirby
 * 
 * @version 20120305-01
 */
public class World {
    
    public static final String name      = "ADVENTURE";
    public static final String title     = name+": Coping with Classes and Patterns";
    public static final String copyright = "Copyright (c) 2012. All rights reserved.";
    public static final String version   = "0.2α";
    public static final String release   = "20120304";
    public static final String IFID      = "49644288-6D81-41C8-A4B6-1EEAECC74C51";
    
    public static final Master master = Master.INSTANCE;
    public static final Player adventurer = Player.INSTANCE;
    public static final Dictionary dictionary = Dictionary.INSTANCE;
    public static final ArrayList<Creature> actors = new ArrayList<Creature>();
    public static final ArrayList<Location> scenes = new ArrayList<Location>();
    
    public static void Build() {
        /**
         * This method builds the dialog, props, actors, and scenes
         * for the given instance
         */
        Dialog.Build();
        Props.Build();
        Actors.Build();
        Scenes.Build();
        /**
         * @see Adventure.GameBuild.Dialog
         * @see Adventure.GameBuild.Props
         * @see Adventure.GameBuild.Actors
         * @see Adventure.GameBuild.Scenes
         */
    }
    
    public static void addActor(Creature c) {
        /**
         * @param c takes a Creature type
         * @see Adventure.Creatures.Creature
         */
        
        /**
         * Define the requested creature as an actor using the
         * parameter c
         */
        actors.add(c);
    }
    
    public static void addScene(Location l) {
        /**
         * @param l takes a Location type
         * @see Adventure.Locations.Location
         */
        
        /** 
         * Define the requested location as a scene using the
         * parameter l
         */
        scenes.add(l);
    }
}
