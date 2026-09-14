public enum Suits {
    Manzu, Souzu, Pinzu, East, South, West, North, Haku, Hatsu, Chun;

    public static boolean isValidSuit(String name) {
        try {
            Suits.valueOf(name);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
