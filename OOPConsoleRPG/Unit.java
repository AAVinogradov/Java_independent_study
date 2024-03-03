package OOPConsoleRPG;

public class Unit {
    private String name;
    private int hp;
    private int hpMax;
    private int attack;
    private int defence;
    private float critAttackChance;
    private boolean defStance;

    // public String getName(){
    //     return name;
    // }

    // public void setName(String name) {
    //     if (name.length() > 2 && name.length() < 20) {
    //     this.name = name;
    //     }
    // }

    public Unit(String name, int hpMax, int attack, int defence) {
        this.name = name;
        this.hpMax = hpMax;
        this.hp = this.hpMax;
        this.attack = attack;
        this.defence = defence;
        this.critAttackChance = 0.2f;

    }

    public void attack(Unit target) {
        int actualAttack = attack;
        if (Math.random() <= critAttackChance) {
            actualAttack *= 2;
        }

        int resultaeAttackAmount = target.takeDamage(actualAttack);
        System.out.println("Персонаж " + name + " наносит врагу " + target.name + " " + resultaeAttackAmount + " единиц урона");
        target.printInfo();
    }

    public void defenceStance() {
        defStance = true;
        System.out.println(name + " защищается");
    }

    public void beginTurn() {
        System.out.println();
        System.out.println("Ход персонажа " + name );
        printInfo();
        defStance = false;

    }

    public int takeDamage(int amout) {
        int actualDefense = defence;
        if (defStance) {
            actualDefense *= 1.5f;

        }
        amout -= actualDefense;
        if (amout < 0) {
            amout = 0;
        }
        hp -= amout;
        return amout;
    }

    public void cure(int amout) {
        hp += amout;
        if (hp > hpMax) {
            hp = hpMax;
        }
    }

    public void printInfo() {
        System.out.println(name + " HP: " + hp + "/" + hpMax + " ATTACK " + attack + " DEFSTANCE " + defStance);
    }


}
