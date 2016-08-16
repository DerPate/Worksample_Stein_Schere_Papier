import de.dominik.Main;
import de.dominik.game.Game;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {
	@Mock
	private Game my_game;
	@InjectMocks
	private Main main;

	@Test
	public void testMain() throws Exception {
		
		Main.main(null);
	}

}
