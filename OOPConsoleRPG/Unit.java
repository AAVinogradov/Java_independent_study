package OOPConsoleRPG;

public class Unit {
    String name;
    int hp;
    int attak;
    float critAttackChance;

    public Unit(String name, int hp, int attak) {
        this.name = name;
        this.hp = hp;
        this.attak = attak;
        this.critAttackChance = 0.5f;

    }

    public void attack(Unit target) {
        target.takeDamage(attak);
        if (Math.random() <= critAttackChance) {
            target.takeDamage(attak);;
            System.out.println(name + " нанес критический урон");
        }
        
    }

    public void defence() {
        System.out.println(name + " защищается");
    }

    public void takeDamage(int amout) {
        hp -= amout;
    }

    public void printInfo() {
        System.out.println(name + " HP: " + hp + " ATTACK " + attak);
    }


}
