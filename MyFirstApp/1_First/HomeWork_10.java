// Реализуйте метод, принимающий в качестве аргумента двумерный целочисленный массив и печатающий его в консоль в виде "таблицы"

public class HomeWork_10 {
    public static void main(String[] args) {
        int [] [] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0}
        };
        printDoubleArray(arr);


    }
    public static void printDoubleArray(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
        System.out.print(" _");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
        System.out.print("|");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "|");
            }
            System.out.println();
        }
    }
}
