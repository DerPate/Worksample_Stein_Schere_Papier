/**
 * 
 */

import de.dominik.game.Game;
import de.dominik.game.Papier;
import de.dominik.game.Schere;
import de.dominik.game.Stein;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * The Class GameTest.
 */
public class GameTest {

	/** The mygame. */
	private static Game mygame;

	/**
	 * Sets the up.
	 */
	@BeforeClass
	public static void setUp() {
		mygame = new Game();
	}

	/**
	 * Test game.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testGame() throws Exception {
		assertNotNull(mygame);

	}

	/**
	 * Test run.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testRun() throws Exception {
		mygame.run();
	}

	/**
	 * Test validate.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testValidate() throws Exception {

		mygame.validate(new Papier(), new Papier());
		mygame.validate(new Stein(), new Papier());
		mygame.validate(new Schere(), new Papier());

	}

	/**
	 * Test print_ stats.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testPrint_Stats() throws Exception {
		mygame.print_Stats();
	}

}
