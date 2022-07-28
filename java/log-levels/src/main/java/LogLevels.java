public class LogLevels {
    
    public static String message(String logLine) {
        int indexOfSeparator = logLine.indexOf(":");
        return logLine.substring(indexOfSeparator + 1, logLine.length()).trim();
    }

    public static String logLevel(String logLine) {
        int indexOfSepearator = logLine.indexOf(":");
        String is_contained = logLine.substring(0, indexOfSepearator);
        return switch (is_contained) {
            case "[ERROR]" -> "error";
            case "[INFO]" -> "info";
            case "[WARNING]" -> "warning";
            default -> "";
        };
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
