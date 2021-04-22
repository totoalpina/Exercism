import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ResistorColorDuo {

    private List<String> listOfColors = Arrays.asList("black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white");


    int value(String[] colors) {
        return Integer.parseInt(Arrays.stream(colors).limit(2)
                .map(color -> getIndexColorAsString(color))
                .collect(Collectors.joining("")));

    }

    private String getIndexColorAsString(String color){
        return Integer.toString(listOfColors.indexOf(color));
    }
}
