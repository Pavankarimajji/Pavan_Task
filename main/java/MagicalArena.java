// MagicalArena.java
public class MagicalArena {
    private Player playerA;
    private Player playerB;

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void startMatch() {
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        while (playerA.isAlive() && playerB.isAlive()) {
            int attackDieRoll = attacker.rollDie();
            attacker.attack(defender, attackDieRoll);

            // Switch roles for the next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        // Print the winner
        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}
