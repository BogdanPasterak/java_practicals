
public class Q_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 25, 14, 56, 15, 36 };
		int[] arr2 = { 11, 15, 99, 40, 3 };
		
		System.out.println("*** BEFORE ***");
		System.out.print("Array 1: [");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ((i < arr1.length - 1) ? ", " : "]\n"));
		}		
		System.out.print("Array 2: [");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ((i < arr2.length - 1) ? ", " : "]\n"));
		}
		
		if ( swap(arr1, arr2) )
			System.out.println("\nSuccessful swap");
		else
			System.out.println("\nFailed swap");
		
		
		System.out.println("\n*** AFTER ***");
		System.out.print("Array 1: [");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ((i < arr1.length - 1) ? ", " : "]\n"));
		}		
		System.out.print("Array 2: [");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ((i < arr2.length - 1) ? ", " : "]\n"));
		}
		
		

	}

	public static boolean swap(int[] array1, int[] array2) {
		
		if (array1.length != array2.length)
			return false;
		
		int temp;
		
		for (int i = 0; i < array1.length; i++) {
			temp =array1[i];
			array1[i] = array2[i];
			array2[i] = temp;
		}
		
		return true;
	}
}
