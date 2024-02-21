package Cycles;

import java.util.Scanner;

public class CycleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество звездочек: ");
        int x = scanner.nextInt();
        primer1(x);
        primer2(x);
        primer3(x);
        scanner.close();
        }
        public static void primer1(int x) {
            int count = x;
            while (true) {
                System.out.print("*");
                count--;
                if (count == 0) {
                    break;
                }
            }
            System.out.println();
        }


        public static void primer2(int x) {
            int count = x;
            while (count > 0) {
                System.out.print("*");
                count--;
        }
        System.out.println();
    }


        public static void primer3(int x) {
            int count = 0;
            while (count < x) {
                System.out.print("*");
                count++;
        }
        System.out.println();
    }
}

