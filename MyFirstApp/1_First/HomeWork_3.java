// Реализуйте метод invert, принимающий на вход целое число и возвращающий его с противоположным знаком (invert(10) => -10 или invert(-5) => 5)

import java.util.Scanner;

public class HomeWork_3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        int result = invert(a);
        System.out.println("Инвертированное число " + result);
        scanner.close();
    }

    public static int invert(int a) {
        int result = a - a - a;
        return result;
    }
}
