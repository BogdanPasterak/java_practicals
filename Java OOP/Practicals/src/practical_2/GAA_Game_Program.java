package practical_2;

import myScanner.MyScanner2;

public class GAA_Game_Program {

	public static void main(String[] args) {

		// create obj 
		GAA_Game gaa = new GAA_Game(
				//////// CDN-------------------------------------------------
				MyScanner2.getString("Enter name of Team 1", "Dublin"),
				MyScanner2.getString("Enter name of Team 2", "Donegal"));
		System.out.println(gaa.getHomeTeam() + " vs " + gaa.getAwayTeam());

		int choise = 0;
		
		do {
			System.out.println(
					"\n***GAA Game Menu***\r\n" + 
					"1.	Goal\r\n" + 
					"2.	Point\r\n" + 
					"3.	Display Score\r\n" + 
					"4.	Display Score In Points\r\n" + 
					"5.	Quit\r\n");
			choise = MyScanner2.getInt("Choise option : ", 1, 5, MyScanner2.NOT_AUTO_FILL);
			
			switch (choise) {
			case 1:
				gaa.goal(MyScanner2.getChar("Which team (H or A)", "AH"));
				break;
			case 2:
				gaa.point(MyScanner2.getChar("Which team (H or A)", "AH"));
				break;
			case 3:
				System.out.println(gaa.getScore());
				break;
			case 4:
				System.out.println(gaa.getScoreInPoints());
				break;
			}
			
		} while (choise != 5);
		
		System.out.println("Bye Bye :)");


	
	}

}
