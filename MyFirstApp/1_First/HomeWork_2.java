import java.util.Scanner;

public class HomeWork_2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        System.out.println("Введите число c");
        int c = scanner.nextInt();
        int result = sumCount(a, b, c);
        System.out.println(a + " + " + b + " + " + c + " = " + result);
        scanner.close();
    }

    public static int sumCount(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}
