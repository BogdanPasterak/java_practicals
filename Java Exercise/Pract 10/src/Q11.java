import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int option = 0;

		while (option != 3) {
			
			System.out.println("\n***MAIN MENU***" +
								"\n  1. Option 1" +
								"\n  2. Option 2" +
								"\n  3. Quit");

			option = sc.nextInt();
			
			switch (option) {
			case 1:
				System.out.println("Option 1 Chosen…");
				break;
			case 2:
				System.out.println("Option 2 Chosen…");
				break;
			case 3:
				System.out.println("Quitting…");
				break;

			default:
				System.out.println("Invalid Option Chosen…");
				break;
			}
			
		}
		

	}

}
