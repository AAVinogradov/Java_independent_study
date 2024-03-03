package OOPConsoleRPG;

public class MainApplication {

    public static void main(String[] args) {
        Unit hero = new Unit("Jack", 30, 4, 2);
        Unit monster = new Unit("Ork", 20, 5, 1);

        hero.beginTurn();
        hero.attack(monster);

        monster.beginTurn();
        monster.attack(hero);


        // System.out.println("Герой идет по подземелью и наступает в ловушку");
        // hero.takeDamage(5);
        // hero.cure(1);
        // hero.setName("Bob");
        // System.out.println(hero.getName());
        


    }
}
