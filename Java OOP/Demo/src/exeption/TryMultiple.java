package exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryMultiple {

	public static void main(String[] args) {

		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter a Integer :");
		try {
			n = sc.nextInt();
			if (99 % n == 0)
				System.out.println(n + " is a factor of 99");
		} catch (ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Enter a Integer other than 0");
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
