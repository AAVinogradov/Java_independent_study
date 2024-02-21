package Cycles;

import java.util.Scanner;

public class CycleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        scanner.close();
        primer1(x);
        primer2(x);
        primer3(x);
        primer4(x);
    }
    public static void primer1(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    public static void primer2(int x) {
        for (int i = 5; i <= x; i++) {
            System.out.print(i);
        }
        System.out.println();
    }


    public static void primer3(int x) {
        for (int i = 5; i <= x; i+= 2) {
            System.out.print(i);
        }
        System.out.println();
    }


    public static void primer4(int x) {
        for (int i = 100; i >= x; i-= 10) {
            System.out.print(i);
        }
        System.out.println();
    }
        
}

