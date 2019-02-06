package differentCoat;

public class PaintRequiredCalculator {

	// On the basis of the surface to be painted, he calculates the amount of 5-liter cans
	public static int numberOfCans ( double surface ) {
		
		// there are no negative surfaces
		if (surface < 0)
			return 0;
		
		// divide by 14 rounded into full cans
		return (int) Math.ceil(surface / 14);
	}
}
