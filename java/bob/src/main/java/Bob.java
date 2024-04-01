/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

public class Bob {
    public Bob() {
    }

    public String hey(String input) {
        if (input.trim().isEmpty()) {
            return "Fine. Be that way!";
        }

        if (input.equals(input.toUpperCase()) && input.matches(".*[a-zA-Z].*") && input.endsWith("?")) {
            return "Calm down, I know what I'm doing!";
        }
        if (input.equals(input.toUpperCase()) && input.matches(".*[a-zA-Z].*")) {
            return "Whoa, chill out!";
        }

        if (input.trim().endsWith("?")) {
            return "Sure.";
        }
        return "Whatever.";
    }
}
