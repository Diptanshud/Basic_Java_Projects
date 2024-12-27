import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int ran = r.nextInt(10);
        System.out.println("Guess The Number ");
        while (true) {
            int n = sc.nextInt();
            if (n == ran) {
                System.out.println("Guess is right ");
                break;
            } else if (n > ran) {
                System.out.println("Guess is greater ");
            } else {
                System.out.println("Guess is lower ");
            }
        }
    }
}
