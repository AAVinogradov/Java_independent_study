import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.println("Введите операцию (+, -, *, /) ");
        char operation = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        double b = sc.nextDouble();

        double result;
        if (operation == '+') {
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if (operation == '-') {
            result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if (operation == '*') {
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        } else if (operation == '/') {
            result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        } else {
            System.out.println("Указанная операция не поддерживается калькулятором");
        }

    }
}
