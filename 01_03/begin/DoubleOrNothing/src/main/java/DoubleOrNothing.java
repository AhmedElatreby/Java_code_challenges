import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

    public void playGame() {
        int user = 10;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Double or Nothing");
        String input = scanner.next();

        if (random.equals(user)) {
            System.out.println("Congratulation you win!" );
        } else {
            System.out.println("try again. it was " + random.equals(user));
        }
        ;



    }
}