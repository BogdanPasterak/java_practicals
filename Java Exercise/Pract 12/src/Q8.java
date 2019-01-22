import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int age, limit;
		double avarage, sum = 0;
		
		System.out.println("How many people : ");
		limit = sc.nextInt();

		for (int counter = 1; counter <= limit; counter++) {
			System.out.print("Enter age of person " + counter + " : ");

			age = sc.nextInt();
			sum += age;
		}
		
		avarage = sum / limit;
		
		System.out.println("Avarage = " + avarage);
		
		
	}

}
