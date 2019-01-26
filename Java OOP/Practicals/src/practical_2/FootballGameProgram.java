package practical_2;

import myScanner.MyScanner2;

public class FootballGameProgram {

	public static void main(String[] args) {

		// create obj 
		FootballGame fg = new FootballGame(
				MyScanner2.getString("Enter name of Team 1", "Manchester United"),
				MyScanner2.getString("Enter name of Team 2", "Liverpool"));
		System.out.println(fg.getHomeTeam() + " vs " + fg.getAwayTeam());

		int choise = 0;
		
		do {
			System.out.println(
					"\n***FootballGame Menu***\r\n" + 
					"1.	Goal\r\n" + 
					"2.	Get Score\r\n" + 
					"3.	Quit\r\n");
			choise = MyScanner2.getInt("Choise option : ", 1, 3, MyScanner2.CAN_NOT_BE_ZERO);
			
			switch (choise) {
			case 1:
				fg.goal(MyScanner2.getChar("Which team (H or A)", "AH"));
				break;
			case 2:
				System.out.println(fg.getScore());
				break;
			}
			
		} while (choise != 3);
		
		System.out.println("Bye Bye :)");


	}

}
