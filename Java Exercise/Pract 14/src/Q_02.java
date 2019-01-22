import myScanner.MyScanner2;

public class Q_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int howMuch = MyScanner2.getInt("Enter the size of array", 1, 10);
		
		
		int[] numbers = new int[howMuch];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = MyScanner2.getInt("Enter the number nr " + (i + 1));
		}
		
		for (int number : numbers) {
			System.out.print(number + ", ");
		}
		
		System.out.println();

	}

}
