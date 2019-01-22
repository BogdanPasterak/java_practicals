
public class MyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse(1248));
	}
	
	public static int reverse(int num) {
		
		int reverse = 0;
		
		while (num > 0) {
			reverse = reverse * 10 + (num % 10);
			num /= 10;
		}
		
		return reverse;
	}

}
