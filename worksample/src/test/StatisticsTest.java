import de.dominik.game.Statistics;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * The Class StatisticsTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class StatisticsTest {

	/** The statistics. */
	@InjectMocks
	private Statistics statistics;

	

	/**
	 * Test statistics.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testStatistics() throws Exception {
		statistics = new Statistics();
		assertNotNull(statistics);
		
	}

	/**
	 * Test get winnings.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testGetWinnings() throws Exception {
		statistics.setWinnings(60);
		assertEquals(60, statistics.getWinnings());
	}

	/**
	 * Test set winnings.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSetWinnings() throws Exception {
		statistics.setWinnings(58);
		assertEquals(58, statistics.getWinnings());
	}
	
	/**
	 * Test get ties.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testGetTies() throws Exception{
		
		statistics.setTies(50);
		
		assertEquals(statistics.getTies(), 50);
		
	}
	
	/**
	 * Test set ties.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSetTies() throws Exception{
		
		statistics.setTies(50);
		assertEquals(statistics.getTies(), 50);
	}

	/**
	 * Test calculate_percentages.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculate_percentages() throws Exception {
		statistics.setWinnings(60);
		statistics.setTies(10);
		statistics.calculate_percentages();
		assertEquals(0.60, statistics.getPercentage_winnings(),0.1);
		assertEquals(0.10, statistics.getPercentage_ties(),0.1);
	}

	/**
	 * Test get percentage_ties.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testGetPercentage_ties() throws Exception {
		statistics.setTies(10);
		statistics.calculate_percentages();
		assertEquals(0.10, statistics.getPercentage_ties(),0.1);

		
	}

	/**
	 * Test winspp.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testWinspp() throws Exception {
		statistics.setWinnings(58);
		statistics.winspp();
		assertEquals(59, statistics.getWinnings());
	}

	/**
	 * Test tiespp.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testTiespp() throws Exception {
		statistics.setTies(50);
		statistics.tiespp();
		assertEquals(statistics.getTies(), 51);
	}


}
