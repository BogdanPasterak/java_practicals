package myScanner;

public class Q_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		char[] ch;
		
		s = MyScanner2.getString("Enter some text", MyScanner2.STRINGS.FIRST_NAME);
		System.out.println("You text ---" + s + "---");
		
		ch = s.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}

	}

}
