
public class MethodeTest {
	public static void main(String[] args) {

		int a = 3, b = 5;

		int sum = add(a, b);

		System.out.println("Sum: " + a + " - " + b + " = " + sum);

		int mul = multiply(a, b);
		System.out.println("Multiply: " + a + " - " + b + " = " + mul);
		
		int sub = subtraction(b, a);
		System.out.println("Subtraction: " + b + " - " + a + " = " + sub);

		double div = division(b, a);
		System.out.println("Division: " + b + " - " + a + " = " + div);
		
		String bogdan = "Bogdan";
		
		surname(bogdan);
		System.out.println(bogdan + "  after");
		

	}
	

	private static void surname(String bogdan) {
		bogdan = "Pasterak";
		System.out.println(bogdan + "  innside");
		
	}


	private static double division(int x, int y) {
		// TODO Auto-generated method stub
		double ans;
		
		ans = (double)x / y;
		return ans;
	}

	private static int subtraction(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	private static int multiply(int x, int y) {
		// TODO return multiply two integers
		return x * y;
	}

	// Adding two integers and return sum
	private static int add(int x, int y) {

		return x + y;
	}

}
