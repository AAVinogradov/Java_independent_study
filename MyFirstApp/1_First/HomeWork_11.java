// Реализуйте метод, принимающий в качестве аргумента двумерный целочисленный массив и возвращающий сумму его элементов

public class HomeWork_11 {
    public static void main(String[] args) {
        int [] [] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(sumDoubleArray(arr));
    
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
}
