import java.util.Scanner;

public class BreakContinueTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Double number, sum = 0.0; Scanner input = new Scanner(System.in);
		 * 
		 * while (true) { System.out.print("Enter a number: "); number =
		 * input.nextDouble();
		 * 
		 * if (number < 0.0) { break; }
		 * 
		 * sum += number; } System.out.println("Sum = " + sum);
		 */

		/*
		 * first: for (int i = 1; i < 5; i++) { second: for (int j = 1; j < 4; j++) { if
		 * (j == 3) { break; } System.out.println("i = " + i + "    j = " + j); } }
		 * 
		 */

		/*
		 * if (true) { System.out.println("if nr 1 start"); if (true) {
		 * System.out.println("  if nr 2 start"); label: // labelled break for "if"
		 * worked !! if (true) { System.out.println("    if nr 3 start"); if (true) {
		 * System.out.println("      if nr 4 start"); break label; //
		 * System.out.println(" if nr 4 end"); } System.out.println("    if nr 3 end");
		 * } System.out.println("  if nr 2 end"); } System.out.println("if nr 1 end"); }
		 */
		/*
		 * label: for (int j = 0; j < 3; j++) {
		 * 
		 * for (int i = 1; i <= 10; ++i) { if (i > 4 && i < 9) { continue label; }
		 * System.out.println(i); }
		 * 
		 * }
		 */

		/*
		 * int i;
		 * 
		 * System.out.println("Loop for"); for (i = 1; i <= 10; ++i) { if (i > 4 && i <
		 * 9) { continue; } System.out.println(i); }
		 * 
		 * 
		 * System.out.println("\nLoop while"); i = 1; while ( i++ <= 10 ) { if (i > 5 &&
		 * i < 10) { continue; } System.out.println(i - 1); }
		 * 
		 * System.out.println("\nLoop do while"); i = 1; do { if (i > 4 && i < 9) {
		 * continue; } System.out.println(i); } while ( ++i <= 10 );
		 * 
		 */

		/*
		 * 
		 * int counter = 0; for (int rowNum = 0; rowNum < 3; rowNum++) { for (int colNum
		 * = 0; colNum < 4; colNum++) { if (colNum != 3) { continue; }
		 * System.out.println("RowNum "+ rowNum +" ; "+"ColNum "+ colNum); counter++; }
		 * }
		 */

		/*
		 * label: for (int i = 1; i < 6; ++i) { for (int j = 1; j < 5; ++j) { if (i == 3
		 * || j == 2) continue label; System.out.println("i = " + i + "; j = " + j); } }
		 * 
		 */

		int i;

		System.out.println("Incrementing 2 in each step (use \"continue\")");
		for (i = 10; i <= 20; i += 2) {
			if (i == 16) {
				continue;
			}
			System.out.print(i + ", ");
		}

		System.out.println("\n\nIncrementing 1 in each step (use \"continue\")");
		for (i = 10; i <= 20; i++) {
			if (i == 16 || i % 2 == 1) {
				continue;
			}
			System.out.print(i + ", ");
		}

		System.out.println("\n\nWith an endless loop (using \"break\" & \"continue\")");
		i = 8;
		for (;;) {
			i += 2;
			if (i > 20)
				break;
			if (i == 16)
				continue;
			System.out.print(i + ", ");
		}

		System.out.println("\n\nEND");

		// System.out.println("End of loop j");
	}
}
