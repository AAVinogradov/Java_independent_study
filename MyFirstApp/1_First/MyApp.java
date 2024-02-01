import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = sc.nextInt();
        System.out.println("Введите число b");
        int b = sc.nextInt();
        System.out.println("Введите число с");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Сумма чисел " + a + ", " + b + " и " + c + " равна: " + sum);
        sc.close();

    }
}
