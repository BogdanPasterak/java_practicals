import java.util.Arrays;

public class ArrayTestCDN2 {

	public static void main(String[] args) {
		
		int a = 4;
		int[] iq = { 2, 4, 6 };
		increaseInt(a);
		System.out.println("Value (outside) = " + a);
		
		increase(iq);
		System.out.println(Arrays.toString(iq));
		
		int twoD[][] = new int[3][];
		
		twoD[0] = new int[3];
		twoD[1] = new int[6];
		twoD[2] = new int[2];
		
		twoD[0][0] = 7;
		twoD[1][5] = 100;
		twoD[2][1] = 21;
		//
		//  twoD[2][5] = 100;
		// out of range
		
		System.out.println();
		for (int[] eachRow : twoD) {
			for (int eachElement : eachRow)
				System.out.print(eachElement + ", ");
			System.out.println();
		}
//		System.out.println(Arrays.toString(twoD[0]));
//		System.out.println(Arrays.toString(twoD[1]));
//		System.out.println(Arrays.toString(twoD[2]));
		int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        if (arr1 == arr2) // Same as arr1.equals(arr2)
            System.out.println("Same");
        else
            System.out.println("Not same");

        
        boolean same = true;
        
		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] != arr2[i]) {
				same = false;
				break;
			}
		}
        if (same) // Same as arr1.equals(arr2)
            System.out.println("Same");
        else
            System.out.println("Not same");
		
	}

	private static void increaseInt(int in) {
		in = in * 2;
		System.out.println("Value (inside) = " + in);
	}

	public static void increase(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * 2;
		}
	}

}
