package org.tp24;

import org.junit.Test;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;


public class ApplicationRunnerTest {

    @Test
    public void testRun() {
        Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

        ApplicationRunner.run();

        assertTrue(logger.isLoggable(Level.INFO));
    }
}