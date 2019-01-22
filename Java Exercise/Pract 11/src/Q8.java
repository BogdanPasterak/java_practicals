import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int age, sum = 0, counter = 1;
		double avarage;

		do {
			System.out.print("Enter age of person " + counter + " : ");

			age = sc.nextInt();
			sum += age;
			counter++;
		} while (counter <= 10);
		
		avarage = sum / 10.0;
		
		System.out.println("Avarage = " + avarage);

	}

}
