package solver;

public enum Suits {
    MANZU, SOUZU, PINZU, EAST, SOUTH, WEST, NORTH, HAKU, HATSU, CHUN;

    public static boolean isValidSuit(String name) {
        try {
            Suits.valueOf(name);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
