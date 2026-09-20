package solver;

public enum Honors {
    EAST, SOUTH, WEST, NORTH, HAKU, HATSU, CHUN;

    public static boolean isValidHonor(String name) {
        try {
            Honors.valueOf(name);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
