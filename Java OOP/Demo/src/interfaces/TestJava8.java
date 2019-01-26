package interfaces;

import java.lang.reflect.InvocationTargetException;

public class TestJava8 implements MyInterface {

	public static void main(String[] args) {
		
		TestJava8 ob = new TestJava8();
		ob.absMethod("example");
		ob.newMethod();
		MyInterface.nextMethod();


	}

	@Override
	public void absMethod(String str) {
		System.out.println("String is : " + str);
	}

}
