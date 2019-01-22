import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printLine();
		printHelloWorld(4);
		printText("");
		printText("Hai");
		printText("How are you");
		printLine();
		addTwoNumbers(5, 6);
		addTwoNumbers(5.5, 6);
		addTwoNumbers(5, 6.4f);
		System.out.println( addOne(1) );
		
		subtractTwoNum(1, .9);

		subtractAskUser();

	}

	private static void subtractAskUser() {
		
		double x, y, subtract;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		x = sc.nextDouble();
		
		System.out.println("Enter next number");
		y = sc.nextDouble();
		
		subtract = subtractTwoNumWithReturn(x, y);
		
		System.out.println(x + " - " + y + " = " + subtract);
	}

	private static int addOne(int in) {
		// TODO Auto-generated method stub
		return ++in;
	}

	private static void subtractTwoNum(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println(x + " - " + y + " = " + (x - y));
		
	}

	private static double subtractTwoNumWithReturn(double x, double y) {
		// TODO Auto-generated method stub
		return x - y;
		
	}

	public static void printHelloWorld(int rep ) {
		
		if ( rep <= 0 )
			return;
		for (int i = 0; i < rep; i++) {
			System.out.println("|Hello World            |");
		}
	}
	
	public static void printLine() {
		System.out.println("-------------------------");
	} 
	
	public static void printText(String text) {
		System.out.print("|");
		System.out.print(text);
		for (int i = 0; i < 23 - text.length(); i++) {
			System.out.print(" ");
		}
		System.out.println("|");
	} 
	
//	public static void addTwoNumbers(int x, int y) {
//		System.out.println("Sum = " + (x + y));
//	}
	
	public static void addTwoNumbers(double x, double y) {
		System.out.println("Sum = " + (x + y));
	}
}
