package myScanner;

public class Q_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		
		s1 = MyScanner2.getString("Please enter a string", MyScanner2.STRINGS.FIRST_NAME);
		System.out.println("You string s1 ---" + s1 + "---");

		if (s1.length() > 10)
			System.out.println("Input string should not exceed 10 characters");
		else
			System.out.println("The input string is valid.");
		
	}

}
