public class Blackjack {

    public int parseCard(String card) {
        return switch(card) {
            case "ace" -> 11;
            case "king", "queen", "jack", "ten" -> 10;
            case "nine" -> 9;
            case "eight" -> 8;
            case "seven" -> 7;
            case "six" -> 6;
            case "five" -> 5;
            case "four" -> 4;
            case "three" -> 3;
            case "two" -> 2;
            default -> 0;
        };
    }

    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if ( isBlackjack ){
            if ( dealerScore < 10 ){
                return "W";
            }
            return "S";
        }
        
        return "P";
        
    }

    public String smallHand(int handScore, int dealerScore) {
        if ( handScore < 21 && handScore >=17  ){
            return "S";
        }
        
        if ( handScore <= 16 && handScore >=12 ){
            if ( dealerScore >= 7 ){
                return "H";
            } else {
                return "S";
            }
        }
         return "H";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
