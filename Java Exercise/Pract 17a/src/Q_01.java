import myScanner.MyScanner2;

public class Q_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		
		s = MyScanner2.getString("Enter some text", MyScanner2.STRINGS.NAME);
		System.out.println("You text ---" + s + "---");
		System.out.println("Length of you text it is " + s.length());
	}

}
