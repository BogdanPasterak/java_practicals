import java.util.Scanner;

public class TestLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int n = 1; Scanner input = new Scanner(System.in);
		 * 
		 * 
		 * while (n != 0) { System.out.print("Input an integer (0 is STOP): "); n =
		 * input.nextInt(); System.out.println("You entered " + n); }
		 * 
		 * System.out.println("Out of loop");
		 * 
		 * 
		 * int i = 5; int min = 0;
		 * 
		 * System.out.println("Counting to " + min);
		 * 
		 * do {
		 * 
		 * System.out.println(" i = " + i);
		 * 
		 * } while (i-- > min);
		 * 
		 * 
		 * 
		 * System.out.println("\nTest");
		 * 
		 * i = 3; while ((i = decrease(i)) >= 0) { System.out.println("i = " + i); }
		 * 
		 * int i; for (i = 0; (byte)i < 2; i--) { System.out.println("i = " + i); }
		 * System.out.println("Oudside i = " + i + "  in byte = " + (byte)i); int sum =
		 * 0;
		 * 
		 * for (int i = 2; i <= 100; i += 2) { sum += i; //System.out.println("i = " + i
		 * + "   Sum = " + sum); }
		 * 
		 * System.out.println("Sum = " + sum);
		 */

		for (int i = 1; i <= 5; i++) {
			if (i > 1)
				System.out.println("-----");

			int j = 1;
			while (j <= 2) {
				System.out.println("i = " + i + "; j = " + j);
				j++;
			}
		}

	}

	public static int decrease(int i) {
		return --i;
	}

}
