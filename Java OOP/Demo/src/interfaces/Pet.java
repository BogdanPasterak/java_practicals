package interfaces;

public interface Pet {

	
	default void eat() {
		System.out.println("I am eating");
	}
	

}
