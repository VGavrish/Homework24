package org.logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load(String fileName) throws IOException, FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        String filePath = "";
        String format = "";
        LoggingLevel level = LoggingLevel.INFO;
        int maxSize = 0;

        while ((line = bufferedReader.readLine()) != null) {
            String parts[] = line.split(": ");
            switch (parts[0]) {
                case "FILE":
                    filePath = parts[1];
                    break;
                case "LEVEL":
                    level = LoggingLevel.valueOf(parts[1]);
                    break;
                case "MAX-SIZE":
                    maxSize = Integer.parseInt(parts[1]);
                    break;
                case "FORMAT":
                    format = parts[1];
                    break;
            }
        }
        bufferedReader.close();
        return new FileLoggerConfiguration(filePath, level, maxSize, format);
    }
}
