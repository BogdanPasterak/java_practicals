package differentCoat;

public class SurfaceCalculator {
	
	// calculating the wall area for painting in a square room
	public static double squareRoom(double height, double length) {
		// 4 walls with dimension height and side
		return 4 * height * length;
	}

	// calculating the wall area for painting in a rectangular room
	public static double rectangularRoom(double height, double length, double width) {
		// 2 walls width by height and 2 walls lenght by height 
		return 2 * height * ( width + length ) ;
	}

	// calculating the wall area for painting in a cylindrical room
	public static double cylindricalRoom(double height, double diameter) {
		// one wall with height and length 2 * r * pi
		return height * diameter * Math.PI;
	}

}
