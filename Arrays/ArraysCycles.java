package Arrays;

import java.util.Arrays;

public class ArraysCycles {
    public static void main(String[] args) {
        sumArray();
        sumArray2();
        sumArray3();
        sumFirstAndLastArrayElements();
        clearArray();
        fillArray();
        fillArrayAsc();
        fillArrayAsc2();
        trickyFillArray();
        trickyFillArray2();
        trickyFillArray3();
        sumTwoArrays();
        manualPrintArray();
        System.out.println("Hello, world!");
        System.out.println(sumArr(new int[] { 1, 2, 3, 4, 5 }));
       
    }
    

    public static void sumArray() { // суммирование элементов
        int[] array = {11, 21, 31, 2, 1};
        int result = array[0] + array[1] + array[2] + array[3] + array[4];
        System.out.println(result);
    }


    public static void sumArray2() { // суммирование элементов
        int[] array = {11, 21, 31, 2, 1};
        int result = 0;
        result += array[0];
        result += array[1];
        result += array[2];
        result += array[3];
        result += array[4];
        System.out.println(result);
    }


    public static void sumArray3() { // суммирование элементов массива через цикл
        int[] array = {11, 21, 31, 2, 1};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        System.out.println(result);
    }
    

    public static void sumFirstAndLastArrayElements() { // суммсрование первого и последнего элементов массива
        int[] array = {11, 21, 31, 2, 212};
        int result = array[0] + array[array.length - 1];
        System.out.println(result);
    }


    public static void clearArray() { //очистка массива и заполнение нулями
        int[] array = {11, 21, 31, 2, 212};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));

    }


    public static void fillArray() {  //заполнение массива определенным числом
        int[] array = new int[100];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = 5;
        }
        System.out.println(Arrays.toString(array));

    }


    public static void fillArrayAsc() { // заполнение массива последовательно по индексу
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));

    }

    public static void fillArrayAsc2() { // заполннение массива последовательно по порядковому номеру
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

    }


    public static void trickyFillArray() { // заполнение массива наоборот
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = (array.length - 1 - i);
        }
        System.out.println(Arrays.toString(array));

    }

    public static void trickyFillArray2() { // заполнение массива от 0 четными числами 
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 4;
        }
        System.out.println(Arrays.toString(array));

    }

    public static void trickyFillArray3() { // заполнение массива от 5 и с шагом 2
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = 5 + i * 2;
        }
        System.out.println(Arrays.toString(array));

    }

    public static void sumTwoArrays() { // Сложение 2х массивов
        int[] arr1 = {11, 21, 31, 2, 1};
        int[] arr2 = {21, 23, 43, 5, 1};
        int[] result = new int[arr1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        System.out.println(Arrays.toString(result));

    }

    public static void manualPrintArray() { // метод печати массива
        int [] arr = {0, 4, 8, 12, 16, 20, 24, 28, 32, 36};
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n"); // переход на новую строку
        System.out.println();
       
    }


    public static int sumArr(int[] array) { //метод возвращающий сумму элементов массива
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
       
    }



    
}
