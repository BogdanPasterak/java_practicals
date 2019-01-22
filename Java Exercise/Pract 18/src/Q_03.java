import myScanner.MyScanner2;

public class Q_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double princ, rate, t, comp;
		
		princ = MyScanner2.getDouble("Principle (amount): ", 10000);
		princ = Math.floor(princ);
		System.out.println(princ);
		t = MyScanner2.getInt("Time: ", 10);
		System.out.println(t);
		rate = MyScanner2.getDouble("Rate: ", 2, 12);
		rate = Math.floor(rate * 10) / 10;
		System.out.println(rate);
		
		comp = princ * Math.pow((1 + rate/100), t);
		System.out.printf("Compound Interest = %.2f%n", comp);
	}

}
