import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arrI = {2,3,4};
		float[] arrF = {6,7,8,9.9f};
		boolean[] arrB = new boolean[4];
		boolean[] arrB2 = {false,true,false,false};
		
		arrB[1] = true;
		
		
		
		System.out.println(arrF.length);
		for (float f : arrF) {
			System.out.print(f + ", ");
		}
		System.out.println();
		/*
		for (int i = 0; i < arrF.length; i++) {
			System.out.print(arrF[i] + ", ");
		}
		System.out.println();
		*/
		
		for (boolean b : arrB) {
			System.out.println(b);
		}
		System.out.println();
		
		System.out.println("Compare Array " + arrB.equals(arrB2));
		System.out.println("Compare Arrays " + Arrays.equals(arrB, arrB2));
		
		System.out.println(Array.class);
	}

}
