package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import practical_1.GAA_Game;

public class GAA_GameTest {
	
	GAA_Game game;


	@Test
	public void newObjectTest() {
		game = new GAA_Game();
		
		assertNotNull(game);
	}

	@Test
	public void initialTest() {
		game = new GAA_Game();
		
		assertEquals(0, game.getHomeGoals());
		assertEquals(0, game.getHomePoints());
		assertEquals(0, game.getAwayGoals());
		assertEquals(0, game.getAwayPoints());
	}

	@Test
	public void assignTest() {
		game = new GAA_Game();
		
		game.setHomeTeam("Dublin");
		assertEquals("Dublin", game.getHomeTeam());

		game.setAwayTeam("Donegal");
		assertEquals("Donegal", game.getAwayTeam());
	}
	
	@Test
	public void goalTest() {
		game = new GAA_Game();
		
		game.setHomeTeam("Dublin");
		game.setAwayTeam("Donegal");

		game.goal('H');
		assertEquals(1, game.getHomeGoals());
		assertEquals(0, game.getAwayGoals());
		
		game.goal('A');
		assertEquals(1, game.getHomeGoals());
		assertEquals(1, game.getAwayGoals());
		
		game.goal('U');
		assertEquals(1, game.getHomeGoals());
		assertEquals(1, game.getAwayGoals());
		
		game.goal('H');
		assertEquals(2, game.getHomeGoals());
		assertEquals(1, game.getAwayGoals());
		
	}

	@Test
	public void pointTest() {
		game = new GAA_Game();
		
		game.setHomeTeam("Dublin");
		game.setAwayTeam("Donegal");

		game.point('H');
		assertEquals(1, game.getHomePoints());
		assertEquals(0, game.getAwayPoints());
		
		game.point('A');
		assertEquals(1, game.getHomePoints());
		assertEquals(1, game.getAwayPoints());
		
		game.point('U');
		assertEquals(1, game.getHomePoints());
		assertEquals(1, game.getAwayPoints());
		
		game.point('H');
		assertEquals(2, game.getHomePoints());
		assertEquals(1, game.getAwayPoints());
		
	}
	
	@Test
	public void getScoreTest() {
		game = new GAA_Game();
		
		game.setHomeTeam("Dublin");
		game.setAwayTeam("Donegal");
		game.goal('H');
		game.goal('A');
		game.goal('A');
		game.goal('A');

		for(int i = 0; i < 7; i++) {
			game.point('H');
			game.point('A');
			game.point('A');
		}
		// Dublin 7, Donegal 14
		
		String score = "Dublin (H) 1G7P - 3G14P Donegal (A)";
		assertEquals(score, game.getScore());
		
	}

	@Test
	public void getScoreInPointsTest() {
		game = new GAA_Game();
		
		game.setHomeTeam("Dublin");
		game.setAwayTeam("Donegal");
		game.goal('H');
		game.goal('A');
		game.goal('A');
		game.goal('A');

		for(int i = 0; i < 7; i++) {
			game.point('H');
			game.point('A');
			game.point('A');
		}
		// Dublin 7, Donegal 14
		
		String score = "Dublin (H) 10P - 23P Donegal (A)";
		assertEquals(score, game.getScoreInPoints());
		
	}


}
