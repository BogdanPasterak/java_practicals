import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter character : ");
		ch = sc.nextLine().toUpperCase().charAt(0);
		
		switch (ch) {
		case 'A': case 'E': case 'I': case 'O': case 'U':
			System.out.println("Vowel");
			break;

		default:
			System.out.println("Not vowel");
			break;
		}

	}

}
