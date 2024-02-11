// Реализуйте метод, при выполнении которого, у пользователя будет запрашиваться ввод целого числа. Метод должен вернуть результат ввода, только если пользователь ввел положительное число.

import java.util.Scanner;

public class HomeWork_8 {
    public static void main(String[] args) {
        positiveCount();
    }
    public static void positiveCount() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число: ");
            int a = scanner.nextInt();
            if (a >= 0) {
                System.out.println("Верно, вы ввели положительное число: " + a);
                scanner.close();
                break;
            }
        }   
    }
}
