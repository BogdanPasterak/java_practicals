
public class ArrayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {10,65,85,6,54,95,11,12,15,22};
		
		System.out.println("test if it is :");
		contains(array, 12);
		System.out.println("test if it is not :");
		contains(array, 99);
	}
	
	public static void contains(int[] array, int searched) {
		for (int each : array) {
			if (each == searched) {
				System.out.println("Number " + searched + " found in the array");
				return;
			}
		}
		// if not !!
		System.out.println("Number " + searched + " not found in the array");

	}

}
