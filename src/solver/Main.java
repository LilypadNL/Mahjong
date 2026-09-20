package solver;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Hand myHand = new Hand();
        String[] splitHand;
        String tile;

        Scanner newTile = new Scanner(System.in);
        System.out.println("Please input a tile. The format should be <suit> <value>.");

        tile = newTile.nextLine();


        while (!tile.equalsIgnoreCase("Done")) {
            splitHand = tile.trim().split(" ");
            if (splitHand.length == 1) {
                myHand.addTile(splitHand[0].toUpperCase());
            } else if (splitHand.length == 2) {
                myHand.addTile(splitHand[0].toUpperCase(), Integer.parseInt(splitHand[1]));
            } else {
            System.out.println("Invalid tile. If you want to stop inserting tiles, type \'Done\'");
            }
            System.out.println("Please enter your next tile.");
            tile = newTile.nextLine();
        }

        newTile.close();

        myHand.sort();

        myHand.getHand();

    }
}
