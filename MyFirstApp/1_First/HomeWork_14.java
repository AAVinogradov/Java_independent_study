// Реализуйте метод, который создает одномерный целочисленный массив размером N и заполняющий его последовательностью [1, 2, 3, 4, N/2, 4, 3, 2, 1] (днина = 9), если длина не четная или [1, 2, 3, 4, N/2, N/2, 4, 3, 2, 1] (днина = 10) - если длина четная.

import java.util.Scanner;

public class HomeWork_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        createArray(size);
        scanner.close();
    }


    public static void createArray (int size) {
    if (size % 2 == 0) {
        for (int i = 1; i <= size / 2; i ++) {
            System.out.print(i + " ");
        }
        for (int j = size / 2; j >= 1; j --) {
            System.out.print(j + " ");
        }   
    } else {
        for (int i = 1; i <= size / 2 + 1; i ++) {
            System.out.print(i + " ");
        }
        for (int j = size / 2; j >= 1; j --) {
            System.out.print(j + " ");
        }   
    }
    }
}