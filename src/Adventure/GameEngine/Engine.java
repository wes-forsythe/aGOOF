/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameEngine;

import java.io.*;
import java.util.ArrayList;
import Adventure.Creatures.ClockWatcher;

import Adventure.GameParser.*;
import Adventure.GameBuild.*;


/**
 * Engine is an enumerated type that implements the Clock interface. Engine is a 
 * singleton that uses lazy initialization. Engine controls the flow of the game
 * being the game clock to which all game events rely upon. It also functions as 
 * the game loop.
 * 
 * @author Jon Calhoun, jeffj
 * 
 * @version 20120207-01
 * 
 * @see Clock
 */
public enum Engine implements Clock {
    INSTANCE;
    
    private InputStream in = System.in;
    private PrintStream out = System.out;
    private ArrayList<ClockWatcher> watchers = new ArrayList<ClockWatcher>();

    Parser parser = new Parser();
    private World world;
    
    private int elapsed = 0;
    
    /**
     * Tick notifies all current subscribing ClockWatchers that the clock has 
     * just ticked by calling its tock method.
     * 
     * @see ClockWatcher
     */
    @Override
    public void tick() {
        ++elapsed;
        for(ClockWatcher w : watchers)
            w.tock();
    }
    
    /**
     * Subscribe registers a new ClockWatcher to the current list of subscribers.
     * 
     * @param w ClockWatcher to be added to the clock observer list. It will be 
     * updated on the next tick of the clock.
     * 
     * @see ClockWatcher
     */
    @Override
    public void subscribe(ClockWatcher w) {
        watchers.add(w);
    }
    
    /**
     * Unsubscribe removes a ClockWatcher from the list of ClockWatchers. It 
     * will no longer be notified on each new tick of the clock.
     * 
     * @param w ClockWatcher to be removed from the list of ClockWatchers.
     * 
     * @see ClockWatcher
     */
    @Override
    public void unsubscribe(ClockWatcher w) {
        int i = watchers.indexOf(w);
        if (i >= 0)
            watchers.remove(i);
    }
    
    /**
     * Changes the InputStream used by Engine for game input. Default is System.in .
     * 
     * @param in InputStream that should be the new in stream for the Engine.
     * 
     * @see InputStream
     */
    public void setInput(InputStream in) {
        this.in = in;
    }
    
    /**
     * Changes the PrintStream used by Engine for game output. Default is System.out .
     * 
     * @param out PrintStream to be new print stream.
     * 
     * @see PrintStream
     */
    public void setOutput(PrintStream out) {
        this.out = out;
    }
    
    /**
     * Play loop for the game. Play reads the input stream and parses it for 
     * actions by the player. Each loop ticks the clock to progress the game 
     * play. Each valid user input parsed is determined to be a clock tick.
     * 
     * @see Action
     * @see Parser
     * @see Player
     * 
     * @throws IOException 
     */
    public void Play() throws IOException {
        Action action;
        
        parser.setInput(in);
        parser.setOutput(out);
        
        World.Build();
        out.printf("Welcome to %s, %s!\n\n", world.name, world.adventurer.name());
        out.printf("Type \"help\" to get instructions.\n");
        do {
            action = parser.parse();    // get and parse user input
                                        // distrubute action and execute
            tick();                     // increment clock... tell other parts to update  
                                        // generate view
        } while (!action.Action().equals("quit"));
    }
}