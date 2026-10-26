package solver;

/*
The goal is to have this function be the main method for determining whether a hand is valid. It takes a hand
and should have methods for returning a boolean 
*/

public class Solver {
    Hand hand;
    int maxHandCounter = 14;
    Solver(Hand hand) { //Constructor that accepts a Hand
        if (hand.getSize() == maxHandCounter) {
            this.hand = hand;
        }
        else {
            throw new IllegalArgumentException("Hand size must be 14 tiles");
        }
    }

    boolean Solve() {
        /*
        Placeholder. Ideally this should return true if valid, false otherwise. It should also print out:
        1) List of yaku
        2) Han, Fu
        3) Score (Oya, ko)
        */
        return false;
    }
   
}