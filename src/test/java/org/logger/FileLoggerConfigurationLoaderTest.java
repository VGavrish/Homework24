package org.logger;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileLoggerConfigurationLoaderTest {

    @Test
    public void testLoadValidConfiguration() throws IOException {
        FileLoggerConfigurationLoader loader = new FileLoggerConfigurationLoader();
        String fileName = "test_config.txt";

        FileLoggerConfiguration config = loader.load(fileName);

        assertEquals("test_log.txt", config.getFilePath());
        assertEquals(LoggingLevel.DEBUG, config.getLoggingLevel());
        assertEquals(1000, config.getMaxSize());
        assertEquals("[%s][%s] %s%n", config.getLogFormat());
    }

    @Test
    public void testLoadInvalidConfiguration() {
        FileLoggerConfigurationLoader loader = new FileLoggerConfigurationLoader();
        String fileName = "invalid_config.txt";

        assertThrows(IOException.class, () -> loader.load(fileName));
    }
}
