package org.jd.tests;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = Logger.getLogger("App");

    public static void main( String[] args )
    {
        logger.log(Level.INFO, "Hello World!" );
        System.out.println("Let's add some message in standard output!" );
    }
}
