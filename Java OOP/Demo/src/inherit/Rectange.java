package inherit;

public class Rectange extends Shape {

	int area;
	
	public void calculateArea() {
		area = length * breadth;
	}
	
	public static void main(String[] args) {

		Rectange r = new Rectange();
		r.length = 5;
		r.breadth = 3;
		
		// calculate
		r.calculateArea();
		
		System.out.println("The Area of rectangle of length " + r.length + 
				" and breadth " + r.breadth + " is = " + r.area);

	}

}
