package org.logger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileMaxSizeReachedExceptionTest {
    @Test
    public void testFileMaxSizeReachedExceptionConstructor() {
        String message = "Maximum file size reached. Current size: 500, Max size: 1000." +
                "A new file Log_2023-07-15_13-30-00.txt has been created";

        FileMaxSizeReachedException exception = new FileMaxSizeReachedException(message);
        assertEquals(message, exception.getMessage());

    }
}
