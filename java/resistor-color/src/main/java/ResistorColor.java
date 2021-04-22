class ResistorColor {

    int colorCode(String color) {
        color = color.toLowerCase();

        switch (color) {
            case "black" -> {
                return 0;
            }
            case "brown" -> {
                return 1;
            }
            case "red" -> {
                return 2;
            }
            case "orange" -> {
                return 3;
            }
            case "yellow" -> {
                return 4;
            }
            case "green" -> {
                return 5;
            }
            case "blue" -> {
                return 6;
            }
            case "violet" -> {
                return 7;
            }
            case "grey" -> {
                return 8;
            }
            case "white" -> {
                return 9;
            }
            default -> {
                return -1;
            }
        }
    }



    public String[] colors() {
        String[] CodeColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return CodeColors;
    }
}

