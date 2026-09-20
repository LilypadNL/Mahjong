package solver;



public class Tiles {
    private Suits suit;
    private int value;

    Tiles(String suit, int value) {
        if (Suits.isValidSuit(suit)  && !Honors.isValidHonor(suit)) {
            this.suit = Suits.valueOf(suit);
        }
        if (value >= 1 && value <= 9) {
            this.value = value;
        }
    }

    Tiles(String suit) {
        if (Honors.isValidHonor(suit)) {
            this.suit = Suits.valueOf(suit);
        }
    }

    void getTile() {
        if (value > 0) {
            System.out.println(value + " of " + suit);
        } else {
            System.out.println(suit);
        }
        
    }

    Suits getSuit() {
        return suit;
    }

    int getValue() {
        return value;
    }

}



