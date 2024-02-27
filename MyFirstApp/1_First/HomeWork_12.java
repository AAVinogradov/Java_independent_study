// Реализуйте метод, принимающий в качестве аргумента двумерный целочисленный массив и возвращающий сумму его диагональных элементов

public class HomeWork_12 {
    public static void main(String[] args) {
        int [] [] arr = {
            {1, 2, 3, 4, 5},
            {4, 5, 6, 7, 8},
            {7, 8, 9, 4, 2},
            {4, 5, 6, 7, 8},
            {7, 8, 9, 4, 2},
        };
        System.out.println(sumDiagonalDoubleArray(arr));
    }

    public static int sumDiagonalDoubleArray(int [][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                if (j == i && j == arr.length - 1 - i) {
                    sum += arr[i][j];
                }
            }
            System.out.println();

        
        }
        return sum;
    }
}