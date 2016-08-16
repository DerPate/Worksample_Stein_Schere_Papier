/**
 * 
 */

import de.dominik.game.Papier;
import de.dominik.game.Schere;
import de.dominik.game.Strategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The Class StrategyTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class StrategyTest {
	
	/** The strategy. */
	@InjectMocks
	private Strategy strategy = new Strategy(1);


	/**
	 * Test strategy.
	 *
	 * @throws Exception the exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testStrategy() throws Exception {
		assertNotNull(strategy);
		assertNotNull(strategy.moves);
		
	@SuppressWarnings("unused")
	Strategy myStrategy = new Strategy(5);
	}

	/**
	 * Test next sign.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testNextSign() throws Exception {
		assertEquals(new Papier(), strategy.nextSign());
		assertNotEquals(new Schere(), strategy.nextSign());
	}

}
