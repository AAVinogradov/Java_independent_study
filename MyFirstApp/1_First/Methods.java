import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        doSomething();
        sumAndPrint(2, 2, 3);
        int z = sum(1, 1, 1);
        int a = pow(2, 2) + pow(2, 3);
        System.out.println("result: " + z);
        System.out.println("result: " + a);
        System.out.println("Введите чило для проверик на четность: ");
        int f = scanner.nextInt();
        isNegative(f);
        boolean y = codeExamole(f);
        System.out.println(y);
        scanner.close();
        

    }
    public static boolean codeExamole(int n) {
        System.out.println(1);
        if (n > 0) {
            return true;
        }
        System.out.println(2);
        System.out.println(3);
        return false;
    }

    public static boolean isPositive(int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void isNegative(int number) {
        if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is positive");
        }
    }


    public static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
        return a;
        }
        if (n == 2) {
            return a * a;
        }
        if (n == 3) {
            return a * a * a;
        }
        return -1;    
    }

    public static int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static void doSomething() {
        System.out.println(1);
        System.out.println(2);
    }

    public static void sumAndPrint(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
    }    
    
}
