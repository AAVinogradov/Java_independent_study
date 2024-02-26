// Реализуйте метод boolean isABiggerThanB(int a, int b) возвращающий true если a больше b и false в противном случае

import java.util.Scanner;

public class HomeWork_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        System.out.println(isABiggerThanB(a, b));
        scanner.close();
    }
    public static boolean isABiggerThanB(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }
    
}
