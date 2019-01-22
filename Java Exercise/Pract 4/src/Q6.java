import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int age, born;
		
		System.out.print("Enter the age (at the end of this year): ");
		age = sc.nextInt();
		born = 2018 - age;
		System.out.println("Year Born : " + born);

	}

}
