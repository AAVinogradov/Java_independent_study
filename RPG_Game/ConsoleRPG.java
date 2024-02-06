package RPG_Game;

import java.util.Random;
import java.util.Scanner;

public class ConsoleRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите имя героя: ");
        String heroName = scanner.next();
        int heroHP = 10;
        int heroAttak = 4;
        int heroMoney = 0;
        String monsterName = "Орк";
        int monsterHP = 8;
        int monsterAttak = 3;
        System.out.println("Игра началась!");
        System.out.println("Герой  в " + heroName + " вошел в лес и видит перед собой монстра по имени " + monsterName + ". Деваться некуда, придется вступитьбой.");
        System.out.println("Бой начинается!");
        while (true) {
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
            if (monsterHP <= 0) {
                System.out.println("" + heroName + " победил и заработал 100 золотых! У монстра по имени " + monsterName + " закончились жизни.");
                heroMoney += 100;
                break;
            }
        } else if (command == 2) {
            System.out.println("Вы решили защищаться от монстра по имени " + monsterName + " и получаете 1 единицу здоровья.");
            heroHP ++;
        } else {
            System.out.println("Не верное действие! Вы пропускаете ход...");
        }
        System.out.println("Промежуточная статистика: Герой " + heroName + " имеет " + heroHP + " единиц здоровья. Монстр " + monsterName + " имеет " + monsterHP + " единиц здоровья");
        //Логика хода монстра
        System.out.println("Ход монстра " + monsterName + ".");
        int monsterCommand = random.nextInt(2);
        if (monsterCommand == 0) {
            System.out.println("Монстр " + monsterName +  " атакует, герой " + heroName + " получает " + monsterAttak + " единиц урона");
            heroHP -= monsterAttak;
            if (heroHP <= 0) {
                System.out.println("" + monsterName + " победил! У героя " + heroName + " закончились жизни.");
                break;
            }
        } else if (monsterCommand == 1) {
            System.out.println("Монстр " + monsterName +  " защищается, и получает 5 единиц здоровья");
            monsterHP += 5;
        }
        System.out.println("Промежуточная статистика: Герой " + heroName + " имеет " + heroHP + " единиц здоровья. Монстр " + monsterName + " имеет " + monsterHP + " единиц здоровья");
    }
    System.out.println("Игра закончилась");
    scanner.close();
}
}
