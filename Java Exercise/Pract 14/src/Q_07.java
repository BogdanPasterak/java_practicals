import myScanner.MyScanner2;

public class Q_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] temperature = new double[7];
		double min = 0;
		double temp;
		
		System.out.println("*** INPUT ***");
		for (int i = 0; i < temperature.length; i++) {
			temp = MyScanner2.getDouble("Day " + (i + 1), -5, 30 );
			temperature[i] = Math.floor(temp * 10) / 10;
		}

		System.out.println("\n*** OUTPUT ***");
		for (int i = 0; i < temperature.length; i++) {
			System.out.println("Day " + (i + 1) + ": " + temperature[i]);
		}

		//calculate min
		min = temperature[0];
		for (double t : temperature) 
			if (t < min)
				min = t;
		
		System.out.println("\nLowest Temp For Week: " + min);
		
	}
	
}
