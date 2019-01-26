package practical_1;

public class SnookerGame {

	// fields
	private String p1Name;
	private String p2Name;
	private int p1Score;
	private int p2Score;
	
	public void ballPotted(int playerID, char ballColor) {
		
		int points = 0;
		
		switch (ballColor) {
		case 'R':
			points = 1;
			break;
		case 'Y':
			points = 2;
			break;
		case 'G':
			points = 3;
			break;
		case 'B':
			points = 4;
			break;
		case 'L':
			points = 5;
			break;
		case 'P':
			points = 6;
			break;
		case 'A':
			points = 7;
			break;
		}
		
		if (playerID == 1)
			p1Score += points;
		else if (playerID == 2)
			p2Score += points;

	}
	
	public String getScore() {
		return p1Name + " " + p1Score + " - " + p2Score + " " + p2Name;
	}
	
	// getters, setters
	public String getP1Name() {
		return p1Name;
	}
	public void setP1Name(String p1Name) {
		this.p1Name = p1Name;
	}
	public String getP2Name() {
		return p2Name;
	}
	public void setP2Name(String p2Name) {
		this.p2Name = p2Name;
	}

	public int getP1Score() {
		return p1Score;
	}

	public int getP2Score() {
		return p2Score;
	}

}
