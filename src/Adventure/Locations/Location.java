/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Locations;

import Adventure.GameObject.*;
/**
 *
 * @author jeffj
 */
public abstract class Location extends GameObject {
    /**
     * protected storage for name
     */    
    protected String name;
     /**
     * constructor places name into protected variable.
     * @param name
     */   
    public Location(String name) {
        super(name.toLowerCase());
        this.name = name;
    }   
     /**
     * access method to protected string variable name
     * @return 
     */   
    @Override
    public String toString() {
        return this.name;
    }
}