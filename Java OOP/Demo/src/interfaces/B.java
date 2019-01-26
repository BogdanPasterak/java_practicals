package interfaces;

public interface B {
	int x = 100;
	void m1();
	public default void mehodFromInterface() {
		System.out.println("Interface B concrete method");
	}
	public static void interF() {
		System.out.println("Interface B");
	}

}
