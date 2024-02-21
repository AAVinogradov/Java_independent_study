package Conditions;

import java.util.Scanner;

public class Conditions {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double x = scan.nextDouble();
        scan.close();
        primer1(x);
        }


    public static void primer1(double x) {
        if (x > 0) {
            System.out.println("Вы ввели положительное число");
        } else if (x == 0) {
            System.out.println("Вы ввели ноль");
        } else {
            System.out.println("Вы ввели отрицательное число");
        
    }
}
}
