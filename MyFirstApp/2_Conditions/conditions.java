import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double count = scan.nextDouble();
        if (count > 0) {
            System.out.println("Вы ввели положительное число");
        } else if (count == 0) {
            System.out.println("Вы ввели ноль");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
}
