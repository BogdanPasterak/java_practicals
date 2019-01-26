package practical_2;

import myScanner.MyScanner2;

public class SnookerGameProgram {

	public static void main(String[] args) {

		// create obj 
		SnookerGame sg = new SnookerGame(
				MyScanner2.getString("Enter name of player 1", "Ronnie O’Sullivan"),
				MyScanner2.getString("Enter name of player 2", "Ken Doherty"));
		System.out.println(sg.getP2Name() + " vs " + sg.getP1Name());

		int choise = 0;
		
		do {
			System.out.println(
					"\n***Snooker Game Menu***\r\n" + 
					"1.	Ball Potted\r\n" + 
					"2.	Display Score\r\n" + 
					"3.	Quit\r\n");
			choise = MyScanner2.getInt("Choise option : ", 1, 3, MyScanner2.NOT_AUTO_FILL);
			
			switch (choise) {
			case 1:
				sg.ballPotted(
						MyScanner2.getInt("Number of Player (1 or 2)", 1, 2),
						MyScanner2.getChar("Which team (R, Y, G, B, L, P or A)", "RYGBLPA"));
				break;
			case 2:
				System.out.println(sg.getScore());
				break;
			}
			
		} while (choise != 3);
		
		System.out.println("Bye Bye :)");

	
	}

}
