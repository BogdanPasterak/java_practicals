import myScanner.MyScanner2;

public class Q_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = MyScanner2.getInt("Enter the number nr " + (i + 1));
		}
		
		for (int number : numbers) {
			System.out.print(number + ", ");
		}
		System.out.println();
	}

}
