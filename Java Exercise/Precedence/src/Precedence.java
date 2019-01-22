
public class Precedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, i, j;
		double z;
		
		// Q1
		x = 20;
		y = 10;
		z = x++ - y * 7 / ++y + x * 10;
		System.out.println("Q  1   z = " + z);
		
		// Q2
		x = 20;
		y = 10;
		z = x - y * 7 / ++y + x * 10;
		System.out.println("Q  2   z = " + z);
		
		// Q3
		x = 20;
		y = 10;
		z = x++ - y * 7 / y + x * 10;
		System.out.println("Q  3   z = " + z);
		
		// Q4
		x = 20;
		y = 10;
		z = ++x - y * 7 / ++y + x * 10;
		System.out.println("Q  4   z = " + z);
		
		// Q5
		x = 20;
		y = 10;
		z = x++ - y++ * 7 / ++y + x * 10;
		System.out.println("Q  5   z = " + z);
		
		// Q6
		i = 0;
		j = 0;
		j = i++ + i++;
		System.out.println("Q  6   j = " + j);
		
		// Q7
		x = 12;
		y = 10;
		z = (x + y++) * 7 + (--y + x);
		System.out.println("Q  7   z = " + z);
		
		// Q8
		x = 12;
		y = 10;
		z = (x++ + y) * 7 + (--y + x);
		System.out.println("Q  8   z = " + z);
		
		// Q9
		x = 12;
		y = 10;
		z = x + y * 7 + (y--+ x);
		System.out.println("Q  9   z = " + z);
		
		// Q10
		x = 12;
		y = 10;
		z = x + y * 7 + (--y + x++);
		System.out.println("Q 10   z = " + z);
		
	}

}
