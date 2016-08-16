import de.dominik.game.Papier;
import de.dominik.game.Schere;
import de.dominik.game.Stein;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * The Class SchereTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class SchereTest {
	
	/** The schere. */
	@InjectMocks
	private Schere schere;

	/**
	 * Test compare to.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCompareTo() throws Exception {

		assertEquals(-1, schere.compareTo(new Stein()));
		assertEquals(0, schere.compareTo(new Schere()));
		assertEquals(1, schere.compareTo(new Papier()));
	}

	/**
	 * Test to string.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testToString() throws Exception {
		assertEquals("Move: Schere",schere.toString());
	}

	/**
	 * Test schere.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSchere() throws Exception {
		Schere myschere = new Schere();

		assertNotNull(myschere);
		assertEquals("Schere", myschere.Name);

	}

	/**
	 * Test equals.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testEquals() throws Exception {
		assertTrue(schere.equals(schere));
	}

}
