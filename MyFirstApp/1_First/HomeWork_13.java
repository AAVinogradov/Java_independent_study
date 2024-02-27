// Реализуйте метол, принимающий в качестве аргумента двумерный целочисленный массив и заменяющий все четные значения на 0


public class HomeWork_13 {
    public static void main(String[] args) {
        int [] [] arr = {
            {1, 2, 3, 4, 5},
            {4, 5, 6, 7, 8},
            {7, 8, 9, 4, 2},
            {4, 5, 6, 7, 8},
            {7, 8, 9, 4, 2},
        };
        replacingEvenNumbers(arr); 
    }

    public static void replacingEvenNumbers(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = array[i][j];
                    
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}