package myScanner;

public class Q_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in, out = "";
		
		in = MyScanner2.getString("Enter some text", MyScanner2.STRINGS.NAME);
		System.out.println("You text ---" + in + "---");
		
		for (int i = 0; i < in.length(); i++) {
			out = in.charAt(i) + out;
		}
		
		System.out.println("Reverse text ---" + out + "---");

	}

}
