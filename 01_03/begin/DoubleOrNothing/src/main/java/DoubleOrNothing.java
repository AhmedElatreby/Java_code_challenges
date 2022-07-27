import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
    private static int startingPoints = 10;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int current = startingPoints;
    private boolean isStillPlaying = true;

    public void playGame() {
        printWelcome();
        askUserToContinue();

        while (this.isStillPlaying){
            printTryToDouble();

           if (shouldDouble()){
               doubleCurrent();
               printCongrats();
               askUserToContinue();
           } else{
               printLost();
               return;
           }
        }
        printWalkAwayMessage();
    }

    private boolean shouldDouble() {
        return this.random.nextInt(2) == 0;
    }

    private void printWalkAwayMessage() {
        System.out.println("Congrats! you finish with " +
                this.current + " points");
    }

    private void printLost() {
        System.out.println("You've lost. " +
                "No points for you");
    }

    private void printCongrats() {
        System.out.println("Congrats! You now have " +
                this.current + " points \n");
    }

    private void doubleCurrent() {
        this.current = this.current * 2;
    }

    private void printTryToDouble() {
        System.out.println("Let's try to double it!");
    }

    private void askUserToContinue() {
        System.out.println("Would you like to continue " +
                "and try to double your winnings? " +
                "Enter YES to continue");
        this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("YES");
    }

    private void printWelcome() {
        System.out.println("Welcome to Double or Nothing game! " +
                "We'll start you off with " + startingPoints +
                " points\n");
    }
}