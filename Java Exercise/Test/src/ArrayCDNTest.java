import java.util.Arrays;

public class ArrayCDNTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[] { 10, 11, 88, 2, 12, 120 };

		// Calling getMax() method for getting max value
		int max = getMax(array);
		System.out.println("Maximum Value is: " + max);

		// Calling getMin() method for getting min value
		int min = getMin(array);
		System.out.println("Minimum Value is: " + min);

		System.out.println( "Element 1 in main " + array[1]);
		
		int[] a2 = array.clone();
		for (int i : a2) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.println(a2.equals(array));
		System.out.println(Arrays.equals(a2, array) + "\n");
		
		int[] back = returnArray(5,10);
		System.out.println("Element 0 = " + back[0]);
		System.out.println("Element 1 = " + back[1]);
		

	}

	private static int[] returnArray(int a, int b) {
		// TODO Auto-generated method stub
		int[] array = new int[2];
		
		array[0] = a + b;
		array[1] = a - b;
		
		return array;
	}

	private static int getMin(int[] array) {
		// TODO Auto-generated method stub
		int min = array[0];
		for (int i : array)
			if (min > i)
				min = i;

		array[1] = 0;

		return min;
	}

	private static int getMax(int[] array) {
		// TODO Auto-generated method stub
		int max = array[0];
		for (int i : array)
			if (max < i)
				max = i;

		return max;
	}

}
