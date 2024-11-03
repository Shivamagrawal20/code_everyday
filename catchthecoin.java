import java.util.Random;
import java.util.Scanner;

public class CatchTheCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int width = 10;
        
        int coinPosition = rand.nextInt(width); // Random position between 0 and width-1
        
        int playerPosition = 0;

        System.out.println("Welcome to 'Catch the Coin'!");
        System.out.println("You are the player, starting at position 0.");
        System.out.println("The coin is falling... You need to catch it!");

        while (true) {
            System.out.println("\nPlayer is at position: " + playerPosition);
            System.out.println("Move left (L) or right (R)?");
            char move = sc.next().charAt(0);

            if (move == 'L' || move == 'l') {
                if (playerPosition > 0) {
                    playerPosition--;
                } else {
                    System.out.println("You're at the leftmost position. Can't move left!");
                }
            } else if (move == 'R' || move == 'r') {
                if (playerPosition < width - 1) {
                    playerPosition++;
                } else {
                    System.out.println("You're at the rightmost position. Can't move right!");
                }
            } else {
                System.out.println("Invalid move. Please enter 'L' or 'R'.");
            }

            // Check if player has caught the coin
            if (playerPosition == coinPosition) {
                System.out.println("\nCongratulations! You've caught the coin at position " + coinPosition + "!");
                break;
            }
        }
        sc.close();
    }
}


        