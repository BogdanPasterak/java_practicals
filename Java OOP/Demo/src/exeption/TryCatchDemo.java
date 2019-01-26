package exeption;

public class TryCatchDemo {

	public static void main(String[] args) {

		int a = 10, b = 5, c = 5, x, y;
		
		try {
			x = a / ( b - c );
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		y = a / ( b + c );
		
		System.out.println("y = " + y);
		

	}

}
