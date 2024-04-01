import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class SqueakyClean {
    static String clean(String identifier) {
        return convertCamelCase(identifier.split(""))
                .stream()
                .filter(c -> !c.equals(""))
                .map(c -> c.equals(" ") ? "_" : c)
                .map(c -> leetChar(c))
                .map(c -> ((c.charAt(0) >= 'α' && c.charAt(0) <= 'ω')
                        || (!Character.isAlphabetic(c.charAt(0))
                                && !c.equals("_"))) ? "" : c)
                .collect(Collectors.joining());
    }

    public static String leetChar(String c) {
        return switch (c) {
            case "4" -> "a";
            case "3" -> "e";
            case "1" -> "l";
            case "0" -> "o";
            case "5" -> "s";
            case "7" -> "t";
            default -> c;
        };
    }

    static List<String> convertCamelCase(String[] strings) {
        int[] indexes = IntStream.range(0, strings.length).filter(i -> strings[i].equals("-")).toArray();
        for (int i : indexes)
            strings[i + 1] = strings[i + 1].toUpperCase();
        return Arrays.stream(strings).filter(c -> !c.equals("-")).collect(Collectors.toList());
    }
}
