import java.util.Arrays;

class ArmstrongNumbers {


    boolean isArmstrongNumber(int numberToCheck) {
        return numberToCheck == Integer.toString(numberToCheck)
                .chars()
                .map(c -> c - '0')
                .reduce(0, (sum, element) -> {
                    return sum + (int) (Math.pow(element, String.valueOf(numberToCheck).length()));
                });
    }
}
