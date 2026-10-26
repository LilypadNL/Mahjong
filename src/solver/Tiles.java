package solver;

import java.util.InputMismatchException;



/*
Tiles are singular objects containing the a Suits parameter called suit and an int parameter called
value. Value is required when suit is 'Manzu', 'Souzu', and 'Pinzu'. Otherwise, there should be no value
input. 

Parameters are private, so there are getters for the whole tile (which prints the suit and value), and just
the suit and value, which returns the parameter values.
*/

public class Tiles{
    private Suits suit;
    private int value;

    Tiles(String suit, int value){
        if (Suits.isValidSuit(suit)  && !Honors.isValidHonor(suit)) {
            this.suit = Suits.valueOf(suit);
        } else {
            throw new InputMismatchException("Honor tiles cannot have numerical values");
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



