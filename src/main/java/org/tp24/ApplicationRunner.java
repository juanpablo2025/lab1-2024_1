package org.tp24;

import java.util.logging.Logger;


public class ApplicationRunner {
    private static final Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {
        run();
    }

    static void run() {
        logger.info("La aplicación ha sido ejecutada exitosamente.");
    }
}
