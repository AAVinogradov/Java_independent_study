// Реализуйте метод, принимающий в качестве аргумента двумерный целочисленный массив и возвращающий сумму его элементов

public class HomeWork_11 {
    public static void main(String[] args) {
        int [] [] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(sumDoubleArray(arr));

        int [] [] arr2 = {
            {323, 346, 231, 12},
            {12, 323, 112, 22, 23},
            {23, 12, 323, 112, 22, 23}
        };
        System.out.println(sumDoubleArray2(arr2));
    
    }

    public static int sumDoubleArray(int [][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
    return sum;
    }

    public static int sumDoubleArray2 (int [] [] arr2) {
        int sum = 0;
        for(int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum += arr2 [i][j];
            }    
        }
    return sum;
    }
}
