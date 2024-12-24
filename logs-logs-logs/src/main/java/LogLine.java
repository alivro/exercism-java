public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String log = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));

        return switch (log) {
            case "TRC" -> LogLevel.valueOf("TRACE");
            case "DBG" -> LogLevel.valueOf("DEBUG");
            case "INF" -> LogLevel.valueOf("INFO");
            case "WRN" -> LogLevel.valueOf("WARNING");
            case "ERR" -> LogLevel.valueOf("ERROR");
            case "FTL" -> LogLevel.valueOf("FATAL");
            default -> LogLevel.valueOf("UNKNOWN");
        };
    }

    public String getOutputForShortLog() {
        LogLevel logLevel = getLogLevel();
        String message = logLine.substring(logLine.indexOf(":") + 2);

        return logLevel.getLogNumber() + ":" + message;
    }
}
