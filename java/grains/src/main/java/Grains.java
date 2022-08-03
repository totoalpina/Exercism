import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        checkSquareValue(square);
        if (square == 1) {
            return BigInteger.valueOf(1L);
        }
        return grainsOnSquare((square - 1)).multiply(BigInteger.valueOf(2l));

    }

    BigInteger grainsOnBoard() {
        List<BigInteger> total = fillTheBoardWithGrains(64);
        return total.stream()
                .reduce(BigInteger::add)
                .orElse(BigInteger.ZERO);
    }

    private void checkSquareValue(int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
    }

    private List<BigInteger> fillTheBoardWithGrains(int square) {
        List<BigInteger> totalGrainsOnBoard = new ArrayList<>();
        totalGrainsOnBoard.add(BigInteger.valueOf(1L));

        for (int i = 1; i < square; i++) {
            totalGrainsOnBoard.add(totalGrainsOnBoard.get(i - 1).multiply(BigInteger.valueOf(2l)));
        }
        return totalGrainsOnBoard;
    }
}
