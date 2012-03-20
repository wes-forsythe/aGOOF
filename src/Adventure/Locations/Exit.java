/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Locations;
import Adventure.Things.*;
/**
 * For defining and initializing exit locations in the game
 *
 * @author Jon Calhoun, Chris Jones, jeffj
 * 
 * @version 20120305-01
 * 
 */
public class Exit 
{
    private Location exitLocation;
    private boolean viewBlocked;
    private Thing prop;
    public Exit(Location l,Thing prop)
    {
        this.exitLocation = l;
        this.prop = prop;
        if(prop == null)
            viewBlocked = false;
        else
            viewBlocked = true;
    }
    
    public Location getLocation()
    {
        return exitLocation;
    }
    
    public void setLocation(Location l)
    {
        this.exitLocation = l;
    }
    
    public String description()
    {
        String des;
        if(!viewBlocked)
            des = exitLocation.description();
        else
            des = prop.description();
        
        return des;
    }
}
