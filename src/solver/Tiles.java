public class Tiles {
    public String suit;
    public int value;

    Tiles(String suit, int value) {
        if (Suits.contains(suit) && !Honors.contains(suit)) {
            this.suit = suit;
        }
        if (value >= 1 && value <= 9) {
            this.value = value;
        }
    }

    Tiles(String suit) {
        if (Honors.contains(suit)) {
            this.suit = suit;
        }
    }


}

enum Suits {
    Manzu,
    Souzu,
    Pinzu,
    East,
    South,
    West, 
    North,
    Haku,
    Hatsu,
    Chun
}

enum Honors {
    East,
    South,
    West,
    North,
    Haku,
    Hatsu,
    Chun
}