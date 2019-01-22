
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0 && i % 4 == 0) {
				sum += i;
				//System.out.println(i);
			}
		}
		System.out.println("Sum = " + sum);
	}

}
