package OOPConsoleRPG;

public class MainApplication {

    public static void main(String[] args) {
        Unit hero = new Unit("Jack", 10, 4);
        Unit monster = new Unit("Ork", 6, 2);

        monster.printInfo();
        hero.attack(monster);
        monster.printInfo();

        hero.printInfo();
        monster.attack(hero);
        monster.attack(hero);

        hero.printInfo();


    }
}
