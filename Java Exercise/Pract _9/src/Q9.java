import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter character : ");
		ch = sc.nextLine().toUpperCase().charAt(0);
		
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			System.out.println("Vowel");
		else
			System.out.println("Not vowel");

	}

}
