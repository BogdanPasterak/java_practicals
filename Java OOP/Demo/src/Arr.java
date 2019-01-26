import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] MyArray = asaignArray();
		OneDArray();
	}
	
	private static String[] asaignArray() {
		// TODO Auto-generated method stub
		return new String[] {"Ford", "Crysler", "VW","Volvo", "GM"};
	}

	public static void OneDArray() {
		String[] carManuf = {"Ford", "Crysler", "VW","Volvo", "GM"};
		System.out.println(Arrays.toString(carManuf));
	}

	public static void OneDArrayLoop() {
		String[] carManuf = asaignArray();
		System.out.println(Arrays.toString(carManuf));
	}

	
}
