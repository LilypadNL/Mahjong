package solver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;


public class Hand{
    ArrayList<Tiles> hand = new ArrayList<>();

    void addTile(String suit, int Value) {
        try {
            Tiles tile = new Tiles(suit, Value);
            if (hand.size() < 18) {
                hand.add(tile);
            }
        } catch(InputMismatchException e) {
            System.err.println("Input Mismatch: " + e.getMessage());
        }
        
        
    }

    void addTile(String honor) {
        Tiles tile = new Tiles(honor);
        if (hand.size() < 18) {
            hand.add(tile);
        }
    }

    void getHand() {
        for (int i = 0; i < hand.size(); i++) {
            hand.get(i).getTile();
        }
    }

    int getSize() {
        return hand.size();
    }

    Tiles getIndex(int i) {
        return hand.get(i);
    }

    ArrayList<Tiles> sort() {
        ArrayList<Tiles> sortedHand = new ArrayList<>();
        hand.sort(Comparator.comparing(Tiles::getSuit).thenComparingInt(Tiles::getValue));
        return sortedHand;
    }
}