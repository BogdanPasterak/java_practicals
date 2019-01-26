package packB;

import packA.subpack.ClassD;

public class ClassE {
	
	// member of class E
	ClassA a = new ClassA();
	
	// constructor with message
	ClassE (){
		System.out.println("Constructor E");
	}

	public static void main(String[] args) {
		// object of class E
		ClassE e = new ClassE();

	}

	// PRIVATE sub CLASS
	private class ClassA{
		// constructor with message
		ClassA(){
			System.out.println("Constructor A");
		}
	}

}
