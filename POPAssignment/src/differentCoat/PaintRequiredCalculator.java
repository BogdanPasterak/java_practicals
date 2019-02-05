package differentCoat;

public class PaintRequiredCalculator {

	public static int numberOfCans ( double surface ) {
		
		return (int) Math.ceil(surface / 14);
	}
}
