import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int aiNumber = random.nextInt(10);
        System.out.println("Компьютер загад число от 1 до 10 включительно");
        while (true) {
            System.out.println("Попробуйте угадать число");
            int answer = scanner.nextInt();
            if (answer == aiNumber) {
                System.out.println("Угадали!");
                scanner.close();
                break;
            } else {
                System.out.println("Не угадали");
            }
        }
    }
}
