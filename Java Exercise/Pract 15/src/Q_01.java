
public class Q_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] output;
		
		output = copy(source);
		
		System.out.print("Source Array : [");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + ((i < source.length - 1) ? ", " : "]\n"));
		}
		
		System.out.print("New Array : [");
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + ((i < output.length - 1) ? ", " : "]\n"));
		}
		
	}

	public static int[] copy(int[] source) {
		// copy of array
		int[] output = new int[source.length];
		for (int i = 0; i < output.length; i++) {
			output[i] = source[i];
		}
		
		return output;
	}

}
