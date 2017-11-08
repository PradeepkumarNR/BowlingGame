package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class bowlingtests {
	private Game game;

	@Before
	public void setUp() throws Exception {
		game = new Game();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Should_score_gutter_game() throws Exception {

		roll(20, 0);

		assertEquals(game.score(), 0);
	}

	@Test
	public void Should_score_a_game_of_1() throws Exception {
	
		roll(20,1);

		//assertEquals(game.score(), 20);
		assertEquals(20, game.score());
	}

	private void roll(int times, int pinsdown) {
		for (int i = 0; i < times; i++) {
			game.roll(pinsdown);
		}
	}
	
	@Test
	public void can_score_spare_followed_by_3() throws Exception {
		game.roll(5);
		game.roll(5);
		game.roll(3);
		roll(17, 0);
		
		assertEquals(16, game.score());
	}

}
