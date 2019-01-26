package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import practical_1.FootballGame;

public class FootballGameTest {

	FootballGame fg;
	
	@Test
	public void newObjectTest() {
		fg = new FootballGame();
		
		assertNotNull(fg);
	}

	@Test
	public void initialTest() {
		fg = new FootballGame();
		
		assertEquals(0, fg.getHomeScore());
		assertEquals(0, fg.getAwayScore());
	}

	@Test
	public void assignTest() {
		fg = new FootballGame();

		fg.setHomeTeam("Manchester United");
		assertEquals("Manchester United", fg.getHomeTeam());

		fg.setAwayTeam("Liverpool");
		assertEquals("Liverpool", fg.getAwayTeam());
	}
	
	@Test
	public void goalTest() {
		fg = new FootballGame();

		fg.setHomeTeam("Manchester United");
		fg.setAwayTeam("Liverpool");

		fg.goal('H');
		assertEquals(1, fg.getHomeScore());
		assertEquals(0, fg.getAwayScore());
		
		fg.goal('A');
		assertEquals(1, fg.getHomeScore());
		assertEquals(1, fg.getAwayScore());

		fg.goal('Z');
		assertEquals(1, fg.getHomeScore());
		assertEquals(1, fg.getAwayScore());
		
		fg.goal('H');
		assertEquals(2, fg.getHomeScore());
		assertEquals(1, fg.getAwayScore());
		
	}

	@Test
	public void getScoreTest() {
		fg = new FootballGame();

		fg.setHomeTeam("Manchester United");
		fg.setAwayTeam("Liverpool");

		fg.goal('H');
		fg.goal('A');
		fg.goal('H');
		
		String score = "Manchester United (H) 2 - 1 Liverpool (A)";
		
		assertEquals(score, fg.getScore());
		
	}

}
