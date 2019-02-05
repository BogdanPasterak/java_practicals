package differentCoat;

public class SurfaceCalculator {
	
	public static double squareRoom(double height, double side) {
		
		return 4 * height * side;
	}

	public static double rectangularRoom(double height, double lenght, double width) {
		
		return 2 * height * ( width + lenght ) ;
	}

	public static double cylindricaRoom(double height, double diameter) {
		
		return height * diameter * Math.PI;
	}

}
