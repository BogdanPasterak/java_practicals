package interfaces;

public class Politician implements Speaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Speaker p = new Politician();
		p.speak();
	}

	public void speak() {
		System.out.println("I speak about politics");
		
	}

}
