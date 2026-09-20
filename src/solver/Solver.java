package solver;


public class Solver {
    Hand hand = new Hand();
    Solver(Hand hand) { //Constructor that accepts a Hand
        if (hand.getSize() == 14) {
            this.hand = hand;
        }
        else {
            throw new IllegalArgumentException("Hand size must be 14 tiles");
        }
    }

    Hand sortHand(Hand hand) { //Method not finished
        Hand sortedHand = new Hand();
        return hand;
    }
    
}