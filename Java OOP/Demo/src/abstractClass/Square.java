package abstractClass;

public class Square extends Shape {

	private double length;
		
	public Square() {
		super();
		System.out.println("square...");
		length = 5;
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	double findArea() {
		
		return length * length;
	}
	
}
