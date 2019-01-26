package abstractClass;

public class ShapeTest {

	public static void main(String[] args) {
		
		Square s = new Square();
		System.out.println("Area of  square = " + s.findArea());
		System.out.println("Colour of square: " + s.getColour());

		Rectangle r = new Rectangle();
		System.out.println("Area of  rectangle = " + r.findArea());
		System.out.println("Colour of rectangle: " + r.getColour());

		Circle c = new Circle();
		System.out.println("Area of  circle = " + c.findArea());
		System.out.println("Colour of circle: " + c.getColour());


	}

}
