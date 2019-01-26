import java.util.Arrays;

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		m1("p1", "p2");
		String[] t = {"zero", "one", "two"};
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(t, 1, t.length)));
		
		System.out.println(Arrays.stream(t).anyMatch("on"::equals));
		
		System.out.println(Arrays.stream(t).anyMatch("one"::equals));
		

	}
	
	static void m1(String... a) {
		System.out.println("Metod 3");
	}
	
	static void m1(String a, String b) {
		System.out.println("Metod 1");
	}

//	static void m1(String[] a) {
//		System.out.println("Metod 2");
//	}
//

}
