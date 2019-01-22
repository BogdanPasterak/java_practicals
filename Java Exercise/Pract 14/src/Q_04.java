import myScanner.MyScanner2;

public class Q_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int SIZE = 10;
		String[] names = new String[SIZE];
		int[] age = new int[SIZE];
		double average = 0;
		
		System.out.println("*** INPUT ***");
		for (int i = 0; i < SIZE; i++) {
			System.out.println("Person " + (i + 1));
			names[i] = MyScanner2.getString("Enter Name", MyScanner2.STRINGS.FIRST_NAME);
			age[i] = MyScanner2.getInt("Enter Age",1, 100);
			System.out.println();
		}

		System.out.println("*** OUTPUT ***");
		for (int i = 0; i < SIZE; i++) {
			System.out.println(names[i] + ": " + age[i]);
		}
		
		//calculate average
		for (int i : age) 
			average += i;
		
		average /= SIZE;
		
		System.out.println("Average: " + average);


		
	}

}
