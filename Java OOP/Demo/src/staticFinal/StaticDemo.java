package staticFinal;

public class StaticDemo {
	int x;
	static int a;

	public static void stMethod() {
		System.out.println("Static method");
		System.out.println("Value static a " + a);
		// System.out.println("Value non static x " + x);
	}

	public void nonStMethod1() {
		System.out.println("Non Static method 1");
		System.out.println("Value static a " + a);
		System.out.println("Value non static x " + x);
		stMethod();
	}

	public void nonStMethod2() {
		System.out.println("Non Static method 2");
		nonStMethod1();
	}

	public static void main(String[] args) {

		StaticDemo sd = new StaticDemo();
		System.out.println(sd.x);
		System.out.println(sd.a);
		System.out.println(StaticDemo.a);
		stMethod();
		sd.stMethod();
		StaticDemo.stMethod();
		sd.nonStMethod2();
		
		final StaticDemo fin = new StaticDemo();
		
		sd = fin;

	}

}
