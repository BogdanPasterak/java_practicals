

import myScanner.MyScanner2;
import myScanner.MyScanner2.STRINGS;

public class Q_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int vowels = 0;
		
		name = MyScanner2.getString("Enter your name", MyScanner2.STRINGS.FIRST_NAME);
		System.out.println("Your name ->" + name + "<-");
		
		for (int i = 0; i < name.length(); i++)
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u' )
				vowels++;
		
		System.out.println("Your name contained " + vowels + " vowels.");
		

	}

}
