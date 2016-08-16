import de.dominik.game.Papier;
import de.dominik.game.Schere;
import de.dominik.game.Stein;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * The Class SteinTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class SteinTest {

	/** The stein. */
	@InjectMocks
	private Stein stein;
	
	/**
	 * Test compare to.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCompareTo() throws Exception {
		assertEquals(-1, stein.compareTo(new Papier()));
		assertEquals(0, stein.compareTo(new Stein()));
		assertEquals(1, stein.compareTo(new Schere()));
	}

	/**
	 * Test to string.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testToString() throws Exception {
		assertEquals("Move: Stein", stein.toString());
	}

	/**
	 * Test stein.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testStein() throws Exception {
		Stein mystein = new Stein();
		assertNotNull(mystein);
		assertEquals("Stein", mystein.Name);
	}

	/**
	 * Test equals.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testEquals() throws Exception {

	assertTrue(stein.equals(stein));
	
	}

}
