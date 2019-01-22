
import java.io.IOException;


public class ScannerTest {

	public static void main(String[] args) {

		System.out.println("Start");
		System.out.println(getChar());
		System.out.println("Stop");
		
	}

	public static int getChar() {

		int data = 0;
		for (;;) {
			try {
				data = System.in.read();
				if (data == 27) { // esc key
					break;
				}
				System.out.print(data);
			} catch (IOException e) {
				System.out.print(data);
			}
		}
		
		return data;
	}
}