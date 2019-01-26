package abstractClass;

public class Rectangle extends Shape {
	
	private double breadth;
	private double length;
	
	public Rectangle() {
		super();
		System.out.println("rectangle...");
		breadth = 3;
		length = 4;
	}

	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	double findArea() {
		
		return breadth * length;
	}

}
