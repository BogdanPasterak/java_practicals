

import myScanner.MyScanner2;

public class Q_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String[] parts;
		
		s = MyScanner2.getString("Enter a Time (HH:MM AM) : ", "03:29 PM");
		System.out.println("You entred ---" + s + "---");
		
		if (s.length() == 8 && s.charAt(2) == ':' && s.charAt(5) == ' ') {
			parts = s.split(":| ");

			for (String string : parts) {
				System.out.println(string + ": Value Goes Here");
			}
		}
		

	}

}
