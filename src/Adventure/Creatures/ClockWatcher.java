/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

/**
 * ClockWater interface is the observer form the observer design pattern. ClockWaters
 * are able to subscribe to a clock and be notified of ticks of the clock.
 * 
 * @author Jon Calhoun, jeffj
 * 
 * @version 20120207-01
 * 
 * @see Clock
 */
public interface ClockWatcher {
    
    /**
     * Outline for the method to update the ClockWatcher for the current tick of
     * the clock that the ClockWatcher is currently subscribed to.
     * 
     * 
     * @see Clock
     */
    public void tock();                     
}
