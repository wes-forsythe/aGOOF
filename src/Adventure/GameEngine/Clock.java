/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameEngine;

import Adventure.Creatures.ClockWatcher;
/**
 * Clock interface uses the Observer Design Pattern objects (subscribers)
 * can subscribe to the clock to be notified of each clock tick.
 * 
 * @author Jon Calhoun, jeffj
 * 
 * @version 20120207-01
 */
public interface Clock {                    // Subject interface
    
    /**
     *  Outline for the increment of the game clock. All current subscribers
     * to the clock should be notified of the clock tick when implementing.
     */
    public void tick(); 
    
    /**
     * Outline for method to add a new ClockWatcher to the current list of subscribers.
     * 
     * @param w ClockerWatcher that is going to subscribing to the clock as an observer.
     * 
     * @see ClockWatcher
     */
    public void subscribe(ClockWatcher w);  
    
    /**
     * Outline for the method to remove a currently subscribed ClockWatcher from 
     * being notified of ticks of the clock.
     * 
     * @param w ClockWatcher that should not observe the clock at each tick.
     * 
     * @see ClockWatcher
     */
    public void unsubscribe(ClockWatcher w);// removeObserver()
}