package interfaces;

public interface Animal {

	void walk();
	
	default void eat() {
		System.out.println("I am eating");
	}
}
