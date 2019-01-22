
public class Q_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] score = {{60,55,70},{80,60,41}};
		
		double [] avarage = new double[2];
		double sum;
		
		for (int student = 0; student < score.length; student++) {
			sum = 0;
			for (int sc : score[student]) {
				sum += sc;
			}
			avarage[student] = sum / 3.0;
			System.out.printf("Avarage score of %s student = %.2f%n", 
					((student == 0) ? "1st": "2nd"), avarage[student]);
		}
	}

}
