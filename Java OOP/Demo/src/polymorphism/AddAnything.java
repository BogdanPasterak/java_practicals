package polymorphism;

public class AddAnything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddAnything add = new AddAnything();
		add.add(2, 3);
		add.add(2, 3, 4);
		add.add(2, 3, 3.3454f);
		add.add(3.3454f, 2, 3);
		
		String b = "Bogdan";
		System.out.println(b instanceof Object);
	}

	public void add(int a, int b) {
		System.out.println(  a + b );
	}
	public void add(int a, int b, int c) {
		System.out.println(  a + b + c );
	}
	public void add(int a, int b, float c) {
		System.out.println(  a + b + c );
	}
	public void add(float a, int b, int c) {
		System.out.println(  a + b + c );
	}
	public void add(String s) {
		System.out.println( s );
	}
	public void add(String s, String o) {
		System.out.println( s );
	}
	public void add(String s, String o, String p) {
		System.out.println( s );
	}
	public void add(String... s) {
		System.out.println( s );
	}

}
