import myScanner.MyScanner2;

public class Q_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int space = 0, length;
		
		name = MyScanner2.getString("Enter your name", MyScanner2.STRINGS.FIRST_NAME);
		System.out.println("Your name ->" + name + "<-");
		
		for (int i = 0; i < name.length(); i++)
			if (name.charAt(i) == ' ')
				space++;
		
		length = name.length() - space;
		System.out.println("Your name contained " + length + " character.");
		
	}

}
