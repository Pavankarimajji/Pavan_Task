// Player.java
public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Player opponent, int dieRoll) {
        int damage = attack * dieRoll;
        opponent.defend(damage);
    }

    public void defend(int damage) {
        int damageDefended = strength * rollDie();
        int damageTaken = Math.max(0, damage - damageDefended);
        health -= damageTaken;
    }

    public int rollDie() {
        return (int) (Math.random() * 6) + 1; // Rolling a 6-sided die
    }
}
