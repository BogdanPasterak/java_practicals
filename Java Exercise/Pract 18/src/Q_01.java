import java.util.Random;
import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int secret = rand.nextInt(1000) + 1;
		int answer;
		//System.out.println("Secret number is "+ secret);
		do {
			System.out.print("Enter a guess: ");
			answer = sc.nextInt();
			if (answer > secret)
				System.out.println("Your guess is greater than the secret number.");
			else if (answer < secret)
				System.out.println("Your guess is smaller than the secret number.");
			else
				System.out.println("Your guess is correct. Congratulations!");
			
		} while (answer != secret);
		
	}

}
