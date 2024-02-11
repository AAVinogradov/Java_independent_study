// Реализуйте метод с целочисленными аргументами a, b, c, d возвращающий результат метематического выражения (a + b) * c -d 

import java.util.Scanner;

public class HomeWork_6 {
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
        int result = mathExp(a ,b, c, d);
        System.out.println("Результат математического выражения равен: " + result);
        scanner.close();
    }

    public static int mathExp(int a, int b, int c, int d) {
        int result = (a + b) * c - d;
        return result;

    }

}
