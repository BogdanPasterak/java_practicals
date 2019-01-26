package practical_1;

public class GAA_Game {

	private String homeTeam;
	private String awayTeam;
	private int homeGoals;
	private int homePoints;
	private int awayGoals;
	private int awayPoints;
	
	
	public void goal(char homeOrAway) {
		
		switch (homeOrAway) {
		case 'H':
			homeGoals++;
			break;
		case 'A':
			awayGoals++;
			break;
		}
	}
	
	public void point(char homeOrAway) {
		
		switch (homeOrAway) {
		case 'H':
			homePoints++;
			break;
		case 'A':
			awayPoints++;
			break;
		}
	}
	
	public String getScore() {
		return	homeTeam + " (H) " + homeGoals + "G" + homePoints + "P" + 
			" - " +	awayGoals + "G" + awayPoints + "P " + awayTeam + " (A)";
	}

	public String getScoreInPoints() {
		int hPoints = homePoints + homeGoals * 3;
		int aPoints = awayPoints + awayGoals * 3;

		return	homeTeam + " (H) " + hPoints + "P" + 
			" - " + aPoints + "P " + awayTeam + " (A)";
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

	public int getHomeGoals() {
		return homeGoals;
	}

	public int getHomePoints() {
		return homePoints;
	}

	public int getAwayGoals() {
		return awayGoals;
	}

	public int getAwayPoints() {
		return awayPoints;
	}

}
