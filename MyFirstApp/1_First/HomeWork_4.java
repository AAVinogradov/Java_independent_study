// Реализуйте метод, принимающий на вход 2 строки и печатающий в консоль в одну строку (между входными строками требуется поставить пробел)

import java.util.Scanner;

public class HomeWork_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String a = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String b = scanner.nextLine();
        scanner.close();
        sumString(a, b);
    }
    public static void sumString(String a, String b) {
        String result = a + " " + b;
        System.out.println(result);
    }
}
