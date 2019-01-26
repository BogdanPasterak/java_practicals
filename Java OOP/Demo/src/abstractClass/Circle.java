package abstractClass;

public class Circle extends Shape {

	private double radius;
	private final double PI = 3.1415926535;
	
	public Circle() {
		super();
		System.out.println("circle...");
		radius = 5;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double findArea() {
		
		return radius * radius * PI;
	}

}
