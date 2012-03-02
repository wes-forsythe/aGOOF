/*
 * aGOOF - Adventure Game Object-Oriented Framework
 * 
 * package Adventure contains main and handles IO
 */
package Adventure;

import java.io.*;
import Adventure.GameBuild.World;

import Adventure.GameEngine.*;

/** Adventure contains the main function for the framework.  In addition, 
 * the class initializes all the IO streams for the game.
 *
 * @author Jeff Jenness
 * @version 20120228-01
 * 
 * @TODO extend the streams to include an output T class for enabling transcripts
 */
public class Adventure {
    /** establishes the input stream for the game */
    public static final InputStream in = System.in;
    /** establishes the output stream for the game */
    public static final PrintStream out = System.out;
    
    /** entry point for the game: prints the banner, sets up the IO, and starts play. 
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        out.printf("%s\n", World.title);
        out.printf("%s\n", World.copyright);
        out.printf("Version %s / Release %s\n", World.version, World.release);
        out.printf("Serial %s\n\n", World.IFID);

        Engine e = Engine.INSTANCE;
        
        e.setInput(in);
        e.setOutput(out);
        
        e.Play();
        
    }
}