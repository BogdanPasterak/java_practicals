package interfaces;

public class Lecturer implements Speaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Speaker l = new Lecturer();
		l.speak();
	}

	public void speak() {
		System.out.println("I speak about Java");
		
	}

}
