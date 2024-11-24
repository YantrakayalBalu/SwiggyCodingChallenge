package SwiggyCoding;

import org.junit.Test;
import static org.junit.Assert.*;


class PlayerTest {

	 @Test
	    public void testTakeDamage() {
	        Player player = new Player(50, 5, 10);
	        player.takeDamage(20);
	        assertEquals(30, player.getHealth());
	    }

	    @Test
	    public void testIsAlive() {
	        Player player = new Player(10, 5, 5);
	        assertTrue(player.isAlive());
	        player.takeDamage(10);
	        assertFalse(player.isAlive());
	    }

}
