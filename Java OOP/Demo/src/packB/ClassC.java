package packB;

import packA.ClassA;
import packA.ClassB;

public class ClassC extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//packA.ClassA a = new packA.ClassA();
		ClassA a = new ClassA();
		ClassC c = new ClassC();
		
		c.message();
		
		ClassB b = new ClassB();
		
		b.main(null);
		ClassB.main(null);
	}

}
