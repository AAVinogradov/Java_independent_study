package Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[1] = 10;
        arr[2] = 22;
        arr[3] = 34;
        arr[4] = 41;    
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(Arrays.toString(arr));

        boolean[] arr2 = new boolean[10];
        arr2[1] = false;
        arr2[2] = true;
        arr2[3] = false;
        arr2[4] = false;    
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);
        System.out.println(Arrays.toString(arr2));
        
        float[] arr3 = new float[10];
        arr3[1] = 2.3f;
        arr3[2] = 2.2f;
        arr3[3] = 3.4f;
        arr3[4] = 4.1f;    
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);
        System.out.println(Arrays.toString(arr3));

        String[] arr4 = new String[10];
        arr4[1] = "2.3f";
        arr4[2] = "2.2f";
        arr4[3] = "3.4f";
        arr4[4] = "4.1f";    
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
        System.out.println(arr4[3]);
        System.out.println(arr4[4]);
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {2, 9, 4, 7, 6, 7, 32, 3, 10, 21, 12, 44};
        System.out.println(Arrays.toString(arr5));

    }
    
    
}
