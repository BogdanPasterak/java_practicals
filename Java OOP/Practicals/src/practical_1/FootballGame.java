package practical_1;

public class FootballGame {

	private String homeTeam;
	private String awayTeam;
	private int homeScore;
	private int awayScore;

	public void goal(char homeOrAway) {
		
		switch (homeOrAway) {
		case 'H':
			homeScore++;
			break;
		case 'A':
			awayScore++;
			break;
		}
	}
	
	public String getScore() {
		return homeTeam + " (H) " + getHomeScore() + " - " +
				awayScore + " " + awayTeam + " (A)";
	}

	// getters and setters
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public int getHomeScore() {
		return homeScore;
	}
	
	public int getAwayScore() {
		return awayScore;
	}
	
	
}
