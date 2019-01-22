import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double length, width, area, perimeter;
		
		System.out.print("Enter the length of rectangle : ");
		length = sc.nextDouble();
		System.out.print("Enter the width of rectangle : ");
		width = sc.nextDouble();
		
		area = length * width;
		perimeter = (length + width) * 2;
		System.out.println("Area of rectangle is " + area);
		System.out.println("Perimeter of rectangle is " + perimeter);
		
	}

}
