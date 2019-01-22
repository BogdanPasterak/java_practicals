package myScanner;

public class Q_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "The quick brown fox jumps over the lazy dog";
		String[] each;
		String searched = "o";
		
		each = s.split(searched);
		
		System.out.println("In string " + s);
		System.out.println("The character '" + searched + "' occurs " + (each.length - 1) + " times");
		
	}

}
