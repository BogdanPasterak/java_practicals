package packA.subpack;

public class ClassD {
	private static int count = 0;
	private final int index;

	public void show() {
		System.out.println("Inside subpack, index = " + index);
	}
	public ClassD(){
		System.out.println("Constructor of ClassD " + count);
		index = count;
		count++;
	}
}
