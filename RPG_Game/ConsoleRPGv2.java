package RPG_Game;

import java.util.Random;
import java.util.Scanner;

public class ConsoleRPGv2 {
    static String heroName;
    static int heroHP;
    static int heroAttak;
    static int heroMoney;
    static String monsterName;
    static int monsterHP;
    static int monsterAttak;
    static Scanner scanner;
    static Random random;
    public static void main(String[] args) {
        init();
        System.out.println("Игра началась!");
        System.out.println("Герой  в " + heroName + " вошел в лес и видит перед собой монстра по имени " + monsterName + ". Деваться некуда, придется вступить в бой.");
        System.out.println("Бой начинается!");
        while (true) {
            heroTurn();
            if (isGameOver()) {
                break;
            }
            printStatistic();
            monsterTurn();
            if (isGameOver()) {
                break;
            }
            printStatistic();
        }
    System.out.println("Игра закончилась");
    scanner.close();
    }
    public static boolean isGameOver() {
        if (heroHP <= 0) {
            System.out.println(monsterName + " победил!");
            return true;
        }
        if (monsterHP <= 0) {
            System.out.println(heroName + " победил!");
            return true;
        }
        return false;
    }
    public static void monsterTurn() {
        //Логика хода монстра
        System.out.println("Ход монстра " + monsterName + ".");
        int monsterCommand = random.nextInt(2);
        if (monsterCommand == 0) {
            System.out.println("Монстр " + monsterName +  " атакует, герой " + heroName + " получает " + monsterAttak + " единиц урона");
            heroHP -= monsterAttak;
        } else if (monsterCommand == 1) {
            System.out.println("Монстр " + monsterName +  " защищается, и получает 5 единиц здоровья");
            monsterHP += 5;
        }
    }
    public static void heroTurn() {
        // Логика хода игрока
        System.out.println("Ход героя: выберите действие: 1 - атаковать. 2 - защищаться.");
        int command = scanner.nextInt();
        if (command == 1) {
            System.out.println("Вы атаковали монстра по имени " + monsterName + " и он получает " + heroAttak + " единиц урона");
            monsterHP -= heroAttak;
            if (random.nextInt(100) < 10) {
                System.out.println("Вам удалось нанести суперудар против монстра по имени " + monsterName + " и он получает дополнительные " + heroAttak + " единиц урона");
                monsterHP -= heroAttak;
            }
            if (random.nextInt(100) < 3) {
                System.out.println("Вам удалось нанести двойной суперудар против монстра по имени " + monsterName + " и он получает дополнительные " + heroAttak + " единиц урона");
                monsterHP -= heroAttak;
            }
        } else if (command == 2) {
            System.out.println("Вы решили защищаться от монстра по имени " + monsterName + " и получаете 1 единицу здоровья.");
            heroHP ++;
        } else {
            System.out.println("Не верное действие! Вы пропускаете ход...");
        }
    }
    public static void printStatistic() {
        System.out.println();
        System.out.println("Статистика");
        System.out.println("Герой HP: " + heroHP);
        System.out.println("Монстр HP: " + monsterHP);
        System.out.println();
    }

    public static void init() {
        scanner = new Scanner(System.in);
        random = new Random();
        System.out.println("Введите имя героя: ");
        heroName = scanner.next();
        heroHP = 10;
        heroAttak = 4;
        heroMoney = 0;
        monsterName = "Орк";
        monsterHP = 8;
        monsterAttak = 3;
    }
}
