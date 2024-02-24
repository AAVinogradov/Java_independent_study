package Arrays;

import java.util.Arrays;

public class multiArrays {
    public static void main(String[] args) {
        int [] [] arr = new int[3] [2];
        //   0 1
        // 0 0 0
        // 1 0 0
        // 2 0 0

        // если будет такое условие arr[2][1] = 5;

        //   0 1
        // 0 0 0
        // 1 4 0
        // 2 0 5
        arr[2][1] = 5;
        arr[1][0] = 4;

        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);
        System.out.println(arr[2][0] + " " + arr[2][1]);

        // другой вариант отображения массива (транспонирование)
        //   0 1 2
        // 0 0 4 0
        // 1 0 0 5
    
        System.out.println(arr[0][0] + " " + arr[1][0] + " " + arr[2][0]);
        System.out.println(arr[0][1] + " " + arr[1][1] + " " + arr[2][1]);
        System.out.println(arr.length); //выведет первую часть массива состоящую из 3
        System.out.println(arr[0].length); //выведет вторую часть массива состоящую из 2

        // Инициализация и печать
        int[][] arr2 = new int[2][3];
        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr2.length; i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
        for (int i = 0; i < arr3.length; i++){
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}
