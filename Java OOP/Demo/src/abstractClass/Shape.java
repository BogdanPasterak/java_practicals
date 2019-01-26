package abstractClass;

public abstract class Shape {
	private String colour;
	
	public Shape() {
		colour = "Red";
		System.out.print("Creating a shape called ");
	}

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	abstract double findArea();

}
