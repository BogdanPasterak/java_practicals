package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import practical_1.SnookerGame;

public class SnookerGameTest {

	SnookerGame sg;
	
	@Test
	public void newObjectTest() {
		sg = new SnookerGame();
		
		assertNotNull(sg);;
	}
	
	@Test
	public void initialTest() {
		sg = new SnookerGame();
		
		assertEquals(0, sg.getP1Score());
		assertEquals(0, sg.getP2Score());
	}

	@Test
	public void assignTest() {
		sg = new SnookerGame();
		
		sg.setP1Name("Ronnie O’Sullivan");
		sg.setP2Name("Ken Doherty");
		
		assertEquals("Ronnie O’Sullivan", sg.getP1Name());
		assertEquals("Ken Doherty", sg.getP2Name());
	}

	@Test
	public void ballPottedTest() {
		sg = new SnookerGame();
		
		sg.setP1Name("Ronnie O’Sullivan");
		sg.setP2Name("Ken Doherty");
		
		sg.ballPotted(1, 'R');	// 1
		sg.ballPotted(1, 'Y');	// 3
		sg.ballPotted(1, 'G');	// 6
		sg.ballPotted(1, 'B');	// 10
		sg.ballPotted(1, 'L');	// 15
		sg.ballPotted(1, 'P');	// 21
		sg.ballPotted(1, 'A');	// 28
		sg.ballPotted(2, 'Z');	// 28 illegal color ball
		sg.ballPotted(0, 'R');	// 28 illegal number player
		
		assertEquals(28, sg.getP1Score());
		assertEquals(0, sg.getP2Score());
	}

	@Test
	public void getScoreTest() {
		sg = new SnookerGame();
		
		sg.setP1Name("Ronnie O’Sullivan");
		sg.setP2Name("Ken Doherty");
		
		for (int i = 0; i < 21; i++) {
			sg.ballPotted(1, 'A');	// 21 * 7 = 147
		}
		
		assertEquals(147, sg.getP1Score());
		assertEquals(0, sg.getP2Score());
		
		String score = "Ronnie O’Sullivan 147 - 0 Ken Doherty";
		
		assertEquals(score, sg.getScore());
	}

}
