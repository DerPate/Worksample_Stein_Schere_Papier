import de.dominik.game.Papier;
import de.dominik.game.Schere;
import de.dominik.game.Stein;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * The Class PapierTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class PapierTest {
	
	/** The papier. */
	@InjectMocks
	private Papier papier;

	/**
	 * Test compare to.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCompareTo() throws Exception {
		
		assertEquals(-1, papier.compareTo(new Schere()));
		assertEquals(0, papier.compareTo(new Papier()));
		assertEquals(1, papier.compareTo(new Stein()));
		
	}

	/**
	 * Test to string.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testToString() throws Exception {
		assertEquals("Move: Papier", papier.toString());
	}

	/**
	 * Test papier.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testPapier() throws Exception {
		
		Papier myPapier = new Papier();
		assertNotNull(myPapier);
		assertEquals("Papier", papier.Name);
	}

	/**
	 * Test equals.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testEquals() throws Exception {
		assertTrue(papier.equals(papier));
	}

}
