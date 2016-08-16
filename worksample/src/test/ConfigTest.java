import de.dominik.Config;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfigTest {
	
	
	@Test
	public void testConst()
	{
		assertEquals(100, Config.ROUNDS);
		assertEquals(2, Config.NUM_PLAYERS);
		assertEquals(2, Config.RANDOM_STRATEGY);
		assertEquals(1, Config.SIMPLE_STRATEGY);
	}

}
