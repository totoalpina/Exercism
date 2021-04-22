import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;

class ReverseString {

    String reverse(String inputString) {
        
        StringBuilder result = new StringBuilder();

        result.append(inputString);

        return new String(result.reverse());
     }
}
