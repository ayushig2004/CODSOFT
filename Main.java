import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int chances = 6;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("welcome Player!");
        System.out.println("Hey Player you have about  " + chances + "  chances to win the game");
        while (playAgain) {
            int ran = getrandN(1, 100);
            boolean guess = false;
            for (int i = 0; i < chances; i++) {
                System.out.println("Chance " + (i + 1) + " Enter your guess: ");
                int user = sc.nextInt();
                if (user == ran) {
                    guess = true;
                    finals += 1;
                    System.out.println("You won it");
                    break;
                } else if (user > ran) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
            }
            if (guess == false) {
                System.out.println("Sorry Player You lost the chance.The number is " + ran);
            }
            System.out.println("Do you want to play Again (y/n)");
            String PA = sc.next(); 
            playAgain = PA.equalsIgnoreCase("y");
        }
        System.out.println("That's it Player, Hope you enjoyed it");
        System.out.println("Here is your Score: " + finals);
    }

    public static int getrandN(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
