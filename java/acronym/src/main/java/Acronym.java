class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String result = "";
        if (Character.isAlphabetic(phrase.charAt(0))) {
            result += phrase.toUpperCase().charAt(0);
        }
        for (int i = 1; i <= phrase.length() - 1; i++) {
            if (Character.isWhitespace(phrase.charAt(i)) || phrase.charAt(i) == '-' || phrase.charAt(i) == '_') {
                if (Character.isAlphabetic(phrase.charAt(i + 1))) {
                    result += phrase.toUpperCase().charAt(i + 1);
                }
            }
        }
        return result;
    }

}
