import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        boolean result = sumPositive(a ,b);
        System.out.println(result);
        scanner.close();
    }

    public static boolean sumPositive(int a, int b) {
        int result = a + b;
        if (result >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
