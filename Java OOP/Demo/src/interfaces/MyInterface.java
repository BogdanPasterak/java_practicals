package interfaces;

import javax.xml.transform.Source;

public interface MyInterface {

	default void newMethod() {
		System.out.println("Default Method");
	}
	
	static void nextMethod() {
		System.out.println("Static method");
	}
	
	void absMethod(String str);
}
