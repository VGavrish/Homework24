package org.logger;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FileLoggerTest {

    public static boolean logFileContains(String filePath, String textToFind) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(textToFind)) {
                    return true;
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    String fileName = "test_log.txt";

    @Test
    public void testInfoLoggingWithInfoLevel() {
        FileLoggerConfiguration config = new FileLoggerConfiguration(fileName, LoggingLevel.INFO, 1000, "[%s][%s] %s%n");
        FileLogger logger = new FileLogger(config);

        logger.info("This is an info message");

        assertTrue(logFileContains("test_log.txt", "This is an info message"));
    }

    @Test
    public void testDebugLoggingWithDebugLevel() {
        FileLoggerConfiguration config = new FileLoggerConfiguration("test_log.txt", LoggingLevel.DEBUG, 1000, "[%s][%s] %s%n");
        FileLogger logger = new FileLogger(config);

        logger.info("This is an debug message");

        assertTrue(logFileContains(fileName, "This is an debug message"));
    }

    @Test
    public void testInfoLoggingWithDebugLevel() {
        FileLoggerConfiguration config = new FileLoggerConfiguration(fileName, LoggingLevel.DEBUG, 1000, "[%s][%s] %s%n");
        FileLogger logger = new FileLogger(config);

        logger.info("This is an info message");

        assertTrue(logFileContains(fileName, "This is an info message"));
    }
}
