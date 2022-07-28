import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PangramChecker {
    public final static int ALPHABET_COUNT =26;
    public boolean isPangram(String input) {
        if (input == null) {
            return false;
        }
        String strUpper = input.toUpperCase();

        Stream<Character> filteredCharStream = strUpper.chars()
                .filter(item -> ((item >= 'A' && item <= 'Z')))
                .mapToObj(c -> (char) c);

        Map<Character, Boolean> alphabetMap =
                filteredCharStream.collect(Collectors.toMap(item -> item, k -> Boolean.TRUE, (p1, p2) -> p1));

        return alphabetMap.size() == ALPHABET_COUNT;
    }

}
