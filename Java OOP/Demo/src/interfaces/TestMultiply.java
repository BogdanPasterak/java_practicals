package interfaces;

public class TestMultiply implements Multiply {

	public static void main(String[] args) {
		
		TestMultiply tm = new TestMultiply();
		
		System.out.println("2 * 3 = " + tm.multiply(2, 3));
		System.out.println("2 * 3 * 4 = " + tm.multiply(2, 3, 4));

	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int multiply(int a, int b, int c) {
		return a * b * c;
	}

}
