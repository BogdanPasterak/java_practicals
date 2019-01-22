package myScanner;

public class Q_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2;
		
		s1 = MyScanner2.getString("Enter First String : ", MyScanner2.STRINGS.FIRST_NAME);
		System.out.println("You text ---" + s1 + "---");

		s2 = MyScanner2.getString("Enter Second String : ", MyScanner2.STRINGS.SURNAME);
		System.out.println("You text ---" + s2 + "---");
		
		System.out.println("Before Swapping :");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		s1 += s2;

		System.out.println("Concate s1 and s2 to s1:");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		s2 = s1.substring(0, s1.length() - s2.length());
		
		System.out.println("Substring s2 from s1:");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		s1 = s1.substring(s2.length());		
		
		System.out.println("Substring s1 from s1:");
		System.out.println("After Swapping :");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

	}

}
