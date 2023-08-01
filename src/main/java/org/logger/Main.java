package org.logger;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileLoggerConfiguration config = null;
        try {
            FileLoggerConfigurationLoader loaderConfig = new FileLoggerConfigurationLoader();
            config = loaderConfig.load("config.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileLogger loger = new FileLogger(config);

        loger.info("This message is for Info level3");
        loger.info("This message is for Info level3");
        loger.debug("This message is for debug level4");
        loger.debug("This message is for debug level4");
        loger.debug("This message is for debug level4");
        loger.debug("This message is for debug level4");
        loger.debug("This message is for debug level4");
    }
}
