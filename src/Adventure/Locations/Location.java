/*
 * aGOOF - Adventure Game Object-Oriented Framework
 * 
 * package Locations contains locations of game objects
 */
package Adventure.Locations;

import Adventure.GameObject.*;
import Adventure.Things.*;
import java.util.ArrayList;
/**Location contains the name of a particular location.
 *
 * @author Jon Calhoun, Keith Smith, jeffj
 */
public abstract class Location extends GameObject
{
     
    protected Exit[] exits = new Exit[10];
    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Fixture> fixtures = new ArrayList<Fixture>();
    /**
     * Location places name into protected variable.
     * @param name
     */   
    public Location(String name, String description) 
    {
        super(name);
        setDescription(description);
        
        for(int i=0; i<exits.length; i++)
            exits[i] = null;
    }
    public void setExit(Exit exit, Direction direction)
    {
        exits[direction.getDirection()] = exit;   
    }
    
    public Exit getExit(Direction direction)
    {
        return exits[direction.getDirection()];
    }
    
    public void addToLocation(Thing t)
    {
        if(t.getClass().equals(Fixture.class))
            fixtures.add((Fixture) t);
        else if(t.getClass().equals(Item.class))
            items.add((Item) t);
        //else
            // throw error
    }
    
    public Thing removeFromLocation(Thing t)
    {
        if(t.getClass().equals(Fixture.class))
            fixtures.remove((Fixture) t);
        else if(t.getClass().equals(Item.class))
            items.remove((Item) t);
        //else
            // throw error
        return t;
    }
    
    public String longDescription()
    {
        //@TODO: Add code to pull discriptions from all 
        // objects present in the location.
        return description();
    }
     /**
     * access method to protected string variable name
     * @return 
     * @see GameObject
     */   
    @Override
    public String toString() 
    {
        return this.name;
    }
}