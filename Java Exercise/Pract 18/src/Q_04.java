import myScanner.MyScanner2;

public class Q_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, answer;
		
		a = MyScanner2.getDouble("a = ", -10, 10);
		System.out.println("You enter a = " + a);
		b = MyScanner2.getDouble("b = ", -20, 20);
		System.out.println("You enter b = " + b);
		c = MyScanner2.getDouble("c = ", -100, 100);
		System.out.println("You enter c = " + c);
		
		answer = b * b - 4 * a * c;
		System.out.println("\nDyscriminant = " + answer);
		
	}

}
