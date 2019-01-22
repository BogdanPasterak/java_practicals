
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "peter piper picked a peck of pickled peppers";
		int counter = 0;
		char ch;
		
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch == 'p')
				counter++;
		}
		System.out.println("Found " + counter + " p's in the string.");
		
	}

}
