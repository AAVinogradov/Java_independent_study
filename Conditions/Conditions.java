package Conditions;

import java.util.Scanner;

public class Conditions {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число x ");
        double x = scan.nextDouble();
        System.out.println("Введите число y ");
        double y = scan.nextDouble();
        scan.close();
        primer1(x);
        primer2(x);
        primer3(x);
        primer4(x);
        primer5(x, y);
        }


    public static void primer1(double x) {
        if (x > 0) {
            System.out.println("Вы ввели положительное число");
        } else if (x == 0) {
            System.out.println("Вы ввели ноль");
        } else {
            System.out.println("Вы ввели отрицательное число");      
        }
        System.out.println();
    }


    // public static void primer2(double x) {
    //     if (x > 0) {
    //         if (x < 50)
    //         System.out.println("Вы попали в заданный диапазон");

    //     }

    // } Тоже самое только состовным условием

    public static void primer2(double x) {
        if (x > 0 && x < 50) {
            System.out.println("Вы попали в заданный диапазон");
        }else {
            System.out.println("Не попали в диапазон");
        }
        System.out.println();
    }


    public static void primer3(double x) {
        if (x > 50 || x < -50) {
            System.out.println("Вы попали в заданный диапазон");
        }else {
            System.out.println("Не попали в диапазон");
        }
        System.out.println();
    }
    // Пример с НЕ на все условие
    public static void primer4(double x) {
        if (!(x > 50 || x < -50)) { // типа наоборот диапазон > - 50 и < 50
            System.out.println("Вы попали в заданный диапазон");
        }else {
            System.out.println("Не попали в диапазон");
        }
        System.out.println();
    }

    public static void primer5(double x, double y) {
        if ((x > 50 && x < 20) || y == 5) { 
            System.out.println("Вы попали в заданный диапазон");
        } else {
            System.out.println("Не попали в диапазон");
        }
        System.out.println();
    }
}