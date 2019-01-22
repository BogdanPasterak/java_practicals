
public class Primary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			if ( isPrime(i)) {
				System.out.print(i + ", ");
				if ( ++count % 5 == 0)
					System.out.println();
			}
		}

	}
	
	public static boolean isPrime( int n ) {
		
		if ( n <= 1)
			return false;
		
		for (int i = 2; i <= n / 2; i++) {
			if ( n % i == 0 )
				return false;
		}
		
		return true;
	}

}
