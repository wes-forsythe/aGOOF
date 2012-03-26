/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Locations;

/**
 *
 * @author Jon Calhoun
 */
public enum Direction
{
    NORTH(0),
    NORTHEAST(1),
    EAST(2),
    SOUTHEAST(3),
    SOUTH(4),
    SOUTHWEST(5),
    WEST(6),
    NORTHWEST(7),
    UP(8),
    DOWN(9);
    
    private int direction;
    
    Direction(int direction)
    {
        this.direction = direction;
    }
    
    public int getDirection()
    {
        return direction;
    }
    
}
