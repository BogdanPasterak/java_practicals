package interfaces;

public class Priest implements Speaker{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Speaker p = new Priest();
		p.speak();
	}
	
	public void speak() {
		System.out.println("I speak about church");
		
	}

}
