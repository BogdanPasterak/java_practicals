
public class Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// variable (length and width hard code set )
		int length = 10, width = 15;
		int perimeter;
		String validate;
		
		// call to squarePerimeter method
		perimeter = squarePerimeter(length);
		System.out.println("Square perimeter of side = " + length +
				" is equals " + perimeter);
		// test value
		validate = validatePerimeter(perimeter, 40);
		System.out.println("Result of the test \"" + validate + "\"\n");
		
		// call to rectanglePerimeter method
		perimeter = rectanglePerimeter(length, width);
		System.out.println("Rectangle perimeter of side = " + length +
				" and " + width + " is equals " + perimeter);
		// test value
		validate = validatePerimeter(perimeter, 50);
		System.out.println("Result of the test \"" + validate + "\"\n");

	}

	private static String validatePerimeter(int perimeter, int should) {
		// TODO Compare the perimeter with the expected value
		// the positive result returns Pass , negative returns Fail
		if (perimeter == should )
			return "Pass";
		else
			return "Fail";
	}

	private static int squarePerimeter(int side) {
		// TODO Return square perimeter.
		return side * 4;
	}

	private static int rectanglePerimeter(int side1, int side2) {
		// TODO Return rectangle perimeter.
		return (side1 + side2) * 2;
	}

}
