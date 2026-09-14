public enum Honors {
    East, South, West, North, Haku, Hatsu, Chun;

    public static boolean isValidHonor(String name) {
        try {
            Honors.valueOf(name);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
