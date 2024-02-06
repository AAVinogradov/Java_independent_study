package RPG_Game;

import java.util.Scanner;

public class ConsoleRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя героя: ");
        String heroName = scanner.next();
        int heroHP = 10;
        int heroAttak = 4;

        String monsterName = "Орк";
        int monsterHP = 8;
        int monsterAttak = 3;
        
        System.out.println("Игра началась!");
        System.out.println("Герой " + heroName + " вошел в лес и видит перед собой монстра по имени " + monsterName + ". Деваться некуда, придется вступить в бой.");
        System.out.println("Бой начинается!");
        System.out.println("Ход героя: выберите действие: 1 - атаковать. 2 - защищаться.");
        int command = scanner.nextInt();
        if (command == 1) {
            System.out.println("Вы атаковали монстра по имени " + monsterName + " и он получает " + heroAttak + " единиц урона");
            monsterHP -= heroAttak;
        } else if (command == 2) {
            System.out.println("Вы решили защищаться от монстра по имени " + monsterName + " и получаете 1 единицу здоровья.");
            heroHP ++;
        } else {
            System.out.println("Не верное действие! Вы пропускаете ход...");
        }
        System.out.println("Промежуточная статистика: Герой " + heroName + " имеет " + heroHP + " единиц здоровья. Монстр " + monsterName + " имеет " + monsterHP + " единиц здоровья");



        System.out.println("Игра закончилась");


        
    }
}
