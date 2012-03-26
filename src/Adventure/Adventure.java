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
 * @version 20120304-01
 * 
 * @TODO extend the streams to include an output T class for enabling transcripts
 */
 /**
 * This is the description/purpose of the Adventure class.
 * 
 * @author Tara Banks
 * @version 20120210-01 
 * @throws IOException
 */

public class Adventure {
    /** establishes the input stream for the game */
        /**
     * Set input to the standard input stream
     */

    public static final InputStream in = System.in;
    /** establishes the output stream for the game */
        /**
     * Set output to the standard output stream
     */

    public static final PrintStream out = System.out;
    
    /** entry point for the game: prints the banner, sets up the IO, and starts play. 
     * @param args the command line arguments
     * @throws IOException
     */
     /**
     * Main method prints game information such as title, copyright, version, release and serial.
     * In addition the the aforementioned tasks, main also creates an instance of the game engine
     * and initializes game play.
     * 
     * @param args the command line arguments
     * @return nothing
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