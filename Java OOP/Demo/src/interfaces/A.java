package interfaces;

public interface A {
	int x = 10;
	void name();
	void m1();
	public default void mehodFromInterface() {
		System.out.println("Interface A concrete method");
	}
	public static void interF() {
		System.out.println("Interface A");
	}
}
