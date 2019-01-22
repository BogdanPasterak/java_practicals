import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int age, sum = 0, counter = 1;
		double avarage;

		while (counter <= 10) {
			System.out.print("Enter age of person " + counter + " : ");

			age = sc.nextInt();
			sum += age;
			counter++;
		}
		avarage = sum / 10.0;
		
		System.out.println("Avarage = " + avarage);

	}

}
