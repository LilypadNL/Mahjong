package solver;


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
   
}