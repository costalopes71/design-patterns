package com.costalopes.behavioral_patterns.chain_of_responsability;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

    private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getSimpleName());

    public static void main(String[] args) {

        LOGGER.setLevel(Level.FINEST);

        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINER);

        LOGGER.addHandler(consoleHandler);

        LOGGER.finest("Finest level o logging"); // this wont print
        LOGGER.finer("Finer level, but not as fine as finest");
        LOGGER.fine("Fine, but not as fine as finer or finest");

    }

}
