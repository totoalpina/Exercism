class ResistorColor {

    int colorCode(String color) {
        color = color.toLowerCase();

        return switch (color) {
            case "black" -> 0;
            case "brown" -> 1;
            case "red" -> 2;
            case "orange" -> 3;
            case "yellow" -> 4;
            case "green" -> 5;
            case "blue" -> 6;
            case "violet" -> 7;
            case "grey" -> 8;
            case "white" -> 9;
            default -> -1;
        };
    }

    public String[] colors() {
        String[] CodeColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return CodeColors;
    }
}

