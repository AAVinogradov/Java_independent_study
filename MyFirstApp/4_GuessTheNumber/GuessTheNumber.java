import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int aiNumber = random.nextInt(10);
        System.out.println("Попробуйте угадать число от 0 до 9 включительно");
        int answer = scanner.nextInt();
        if (answer == aiNumber) {
            System.out.println("Угадали!");
        } else {
            System.out.println("Не угадали");
            scanner.close();
        }
    }
}
