package Cycles;

public class nestedLoops {
    public static void main(String[] args) {
        cycleInCycle();
        System.out.println();
        cycleInCycle2();
        System.out.println();
        cycleInCycle3();
        System.out.println();
        cycleInCycle4();
        System.out.println();
        cycleInCycle5();
        System.out.println();
        cycleInCycle6();
        System.out.println();
        cycleInCycle7();
        System.out.println();
        cycleInCycle8();
        System.out.println();
        cycleInCycle9();

    }

    public static void cycleInCycle() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j <3; j++) {
                System.out.print("*");
                
            }
            
        }
    }

    public static void cycleInCycle2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < 5) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

// 00000*****
// 00000*****
// 00000*****
// 00000*****
// 00000*****
// 00000*****
// 00000*****
// 00000*****
// 00000*****
// 00000*****
        }
    }
    

    public static void cycleInCycle3() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (y < 5) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
// 0000000000
// 0000000000
// 0000000000
// 0000000000
// 0000000000
// **********
// **********
// **********
// **********
// **********
        }
    }

    public static void cycleInCycle4() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (y > 2 && y < 7) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
// **********
// **********
// **********
// 0000000000
// 0000000000
// 0000000000
// 0000000000
// **********
// **********
// **********
        }
    }

    public static void cycleInCycle5() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (y > 2 && y < 7 && x > 2 && x < 7) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
// **********
// **********
// **********
// ***0000***
// ***0000***
// ***0000***
// ***0000***
// **********
// **********
        }
    }

    // Динамические границы

    public static void cycleInCycle6() {
        int imageSize = 30;
        int borderSize = 5;
        for (int y = 0; y < imageSize; y++) {
            for (int x = 0; x < imageSize; x++) {
                if (y > borderSize - 1 && y < imageSize - borderSize && x > borderSize - 1 && x < imageSize - borderSize) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
// **********
// *00000000*
// *00000000*
// *00000000*
// *00000000*
// *00000000*
// *00000000*
// *00000000*
// *00000000*
// **********
        }
    }

// шахматная доска
    public static void cycleInCycle7() {
        int imageSize = 20;
        for (int y = 0; y < imageSize; y++) {
            for (int x = 0; x < imageSize; x++) {
                if (((x / 2) + (y / 2)) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
// **00**00**00**00**00
// **00**00**00**00**00
// 00**00**00**00**00**
// 00**00**00**00**00**
// **00**00**00**00**00
// **00**00**00**00**00
// 00**00**00**00**00**
// 00**00**00**00**00**
// **00**00**00**00**00
// **00**00**00**00**00
// 00**00**00**00**00**
// 00**00**00**00**00**
// **00**00**00**00**00
// **00**00**00**00**00
// 00**00**00**00**00**
// 00**00**00**00**00**
// **00**00**00**00**00
// **00**00**00**00**00
// 00**00**00**00**00**
// 00**00**00**00**00**
        }
    }

    // кружок
    public static void cycleInCycle8() {
        int imageSize = 20;
        int radius = 7;
        for (int y = 0; y < imageSize; y++) {
            for (int x = 0; x < imageSize; x++) {
                if ((x - imageSize / 2) * (x - imageSize / 2) + (y - imageSize / 2) * (y - imageSize / 2) < radius * radius) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
// ********************
// ********************
// ********************
// ********************
// *******0000000******
// ******000000000*****
// *****00000000000****
// ****0000000000000***
// ****0000000000000***
// ****0000000000000***
// ****0000000000000***
// ****0000000000000***
// ****0000000000000***
// ****0000000000000***
// *****00000000000****
// ******000000000*****
// *******0000000******
// ********************
// ********************
// ********************
        }
    }

    // участок
    public static void cycleInCycle9() {
        int imageSize = 10;
        for (int y = 0; y < imageSize; y++) {
            for (int x = 0; x < imageSize; x++) {
                if (x > 0 && x < 5 && y > 0 && y < 4) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
// **********
// *0000*****
// *0000*****
// *0000*****
// **********
// **********
// **********
// **********
// **********
// **********
        }
    }


}
