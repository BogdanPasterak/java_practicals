package practical_2;

import myScanner.MyScanner2;

public class NumberPairProgram {

	public static void main(String[] args) {

		NumberPair np = new NumberPair(MyScanner2.getInt("Enter first  number (int): ", 30),
				MyScanner2.getInt("Enter second number (int): ", 50));

		System.out.println("number1 = " + np.number1 + ",  number2 = " + np.number2);

		int choise = 0;

		do {
			System.out.println("\n***NumberPair Menu***\n1. Sum\n2. Difference\n"
					+ "3. Product\n4. Average\n5. Maximum\n6. Minimum\n7. Quit\n");
			
			choise = MyScanner2.getInt("Choise option : ", 1, 7, MyScanner2.CAN_NOT_BE_ZERO);
			System.out.println();
			
			switch (choise) {
			case 1:
				System.out.println("Sum = " + np.sum());
				break;
			case 2:
				System.out.println("Difference = " + np.difference());
				break;
			case 3:
				System.out.println("Product = " + np.product());
				break;
			case 4:
				System.out.println("Average = " + np.average());
				break;
			case 5:
				System.out.println("Maximum = " + np.maximum());
				break;
			case 6:
				System.out.println("Minimum = " + np.minimum());
				break;
			}

		} while (choise != 7);
		
		System.out.println("Bye Bye :)");

	}

}
