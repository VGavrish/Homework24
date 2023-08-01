package org.logger;

public class FileLoggerConfiguration {
    private String filePath;
    private LoggingLevel loggingLevel;
    private long maxSize;
    private String logFormat;

    public FileLoggerConfiguration(String filePath, LoggingLevel loggingLevel, long maxSize, String logFormat) {
        this.filePath = filePath;
        this.loggingLevel = loggingLevel;
        this.maxSize = maxSize;
        this.logFormat = logFormat;
    }

    public String getFilePath() {
        return filePath;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public String getLogFormat() {
        return logFormat;
    }
}
