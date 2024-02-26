// 1. 
// ******00000
// ******00000
// ******00000
// ******00000
// ******00000
// ******00000
// ******00000
// ******00000
// ******00000
// поиграть со смещением границ, поменять местами нули, добавить разделительные полосы по середине

// 2. 
// **********
// **********
// 0000000000
// **********
// **********
// **********
// **********
// **********
// **********
// **********
// Поиграть со строками и столбцами
// 3. 
// **********
// *0000*****
// *0000*****
// *0000*****
// **********
// **********
// *0000*****
// *0000*****
// *0000*****
// **********
// Попробовать сделать диагонали и потом закрасить одну часть или 2 диагонали. Толщину линий также регулировать

import java.util.Scanner;

public class HomeWork_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту: ");
        int hightSize = scanner.nextInt();
        System.out.println("Введите ширину: ");
        int widthSize = scanner.nextInt();
        scanner.close();
        cycleInCycle1(hightSize, widthSize);
        cycleInCycle2(hightSize, widthSize);
        cycleInCycle3(hightSize, widthSize);

        
    }

    public static void cycleInCycle1(int hightSize, int widthSize) {
        
        for (int y = 0; y < hightSize; y++) {
            for (int x = 0; x < widthSize; x++) {
                if (x > 1 && x < 4 && y > 1 && y < 4) {
                    System.out.print("0");
                } else if (x == hightSize / 2) {
                    System.out.print("|");

                } else if (y == widthSize / 2) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
    }
    System.out.println();

    }
    public static void cycleInCycle2 (int hightSize, int widthSize) {
        
        for (int y = 0; y < hightSize; y++) {
            for (int x = 0; x < widthSize; x++) {
                if (x == y || x == hightSize  - 1 - y) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
        System.out.println();

        }    
        System.out.println();
    }

    public static void cycleInCycle3 (int hightSize, int widthSize) {
        
        for (int y = 0; y < hightSize; y++) {
            for (int x = 0; x < widthSize; x++) {
                if (x >= 0 && x < widthSize && y >= hightSize / 2 && y < hightSize) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
        System.out.println();

        }    
        System.out.println();
    }
}