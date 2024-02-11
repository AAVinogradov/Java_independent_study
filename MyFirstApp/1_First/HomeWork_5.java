// Реализуйте метод, который принимает в качестве аргументов 4 целых числа и возвращает true если их сумма >= 0, и false в противном случае

import java.util.Scanner;

public class HomeWork_5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        System.out.println("Введите число c");
        int c = scanner.nextInt();
        System.out.println("Введите число d");
        int d = scanner.nextInt();
        boolean result = sumPositive(a ,b, c, d);
        System.out.println(result);
        scanner.close();
    }

    public static boolean sumPositive(int a, int b, int c, int d) {
        int result = a + b + c + d;
        if (result >= 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
