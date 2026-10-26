package solver;
import java.util.HashMap;



public class Mapper {
    private HashMap<Tiles, Integer> tileCount = new HashMap<>();
    private final Hand hand;

    Mapper(Hand hand) {
        this.hand = hand;
        for (int i = 0; i < hand.getSize(); i++) {
            if (tileCount.containsKey(hand.getIndex(i))) {
                tileCount.replace(hand.getIndex(i), tileCount.get(hand.getIndex(i)), 
                tileCount.get(hand.getIndex(i))+1);
            } else {
                tileCount.put(hand.getIndex(i), 1);
            }
        }
    }

    int numKans() {
        if (hand.getSize() <= 14 || hand.getSize() > 18) {
            return 0;
        }
        //Figure out how I want to handle Kans

        return 0;
    }

    //This would be a good place to check for valid hand size, maybe.
}
