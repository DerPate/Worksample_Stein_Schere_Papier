/**
 * 
 */

import de.dominik.game.Papier;
import de.dominik.game.SimplePlayer;
import de.dominik.game.Statistics;
import de.dominik.game.Strategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The Class SimplePlayerTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class SimplePlayerTest {
	
	/** The my_stats. */
	@Mock
	private Statistics my_stats;

	/** The my_strategy. */
	@Mock
	private Strategy my_strategy;

	
	/** The simple player. */
	@InjectMocks
	private SimplePlayer simplePlayer;

	/**
	 * Test next move.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testNextMove() throws Exception {
		
		assertEquals(1, simplePlayer.my_strategy.strategy_flag);
		assertEquals(new Papier(), simplePlayer.nextMove());
		
	}

	/**
	 * Test simple player.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSimplePlayer() throws Exception {
		
		simplePlayer = new SimplePlayer("A");
		
		assertEquals("A", simplePlayer.name);
		assertNotNull(simplePlayer.my_stats);
		assertNotNull(simplePlayer.my_strategy);
		
		
	}

}
