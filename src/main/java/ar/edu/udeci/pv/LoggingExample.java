package ar.edu.udeci.pv;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingExample {
    private static final Logger logger = LogManager.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("La aplicación ha comenzado.");

        try {
            int result = 10 / 2;
            logger.debug("El resultado de la división es: {}", result);
        } catch (ArithmeticException e) {
            logger.error("Error aritmético: División por cero.", e);
        }

        logger.warn("Esta es una advertencia.");
        logger.error("Este es un error.");
        logger.fatal("Este es un error fatal.");

        logger.info("La aplicación ha finalizado.");
    }
}