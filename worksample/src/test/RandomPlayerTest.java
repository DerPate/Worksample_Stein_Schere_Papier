/**
 * 
 */

import de.dominik.game.Move;
import de.dominik.game.RandomPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * The Class RandomPlayerTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class RandomPlayerTest {
	
	/** The random player. */
	@InjectMocks
	private RandomPlayer randomPlayer;

	/**
	 * Test next move.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testNextMove() throws Exception {
		
		assertThat(randomPlayer.nextMove(), instanceOf(Move.class));
		assertEquals(2, randomPlayer.my_strategy.strategy_flag);
	}

	/**
	 * Test random player.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testRandomPlayer() throws Exception {
		randomPlayer = new RandomPlayer("A");
		
		assertEquals("A", randomPlayer.name);
		assertNotNull(randomPlayer.my_stats);
		assertNotNull(randomPlayer.my_strategy);
	}

}
