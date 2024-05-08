import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testAttack() {
        Player attacker = new Player(50, 5, 10);
        Player defender = new Player(100, 10, 5);

        // Simulate attack with die roll 5
        attacker.attack(defender, 5);

        // After attack, defender's health should decrease
        assertEquals(70, defender.getHealth());

        // Simulate attack with die roll 3
        attacker.attack(defender, 3);

        // After another attack, defender's health should decrease further
        assertEquals(45, defender.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player(50, 5, 10);

        // Player's health is initially above 0
        assertTrue(player.isAlive());

        // Reduce player's health to 0
        player.attack(player, 5);

        // After attack, player's health should reach 0
        assertFalse(player.isAlive());
    }
}
