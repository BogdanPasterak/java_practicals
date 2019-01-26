import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Random rand = new Random();

		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		System.out.println("Start, unsorted array");
		System.out.println(Arrays.toString(array));
		System.out.println();

		bubbleSort(array);

		System.out.println();
		System.out.println("Stop, sorted array");
		System.out.println(Arrays.toString(array));

//		for (;;) {
//			try {
//				int data = System.in.read();
//				if (data == 27 || data == 102) { // esc key
//					break;
//				}
//				System.out.print(data);
//				break;
//			} catch (IOException e) {
//			}
//		}
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char c = (char)br.read();
//        System.out.println(c);

        



        int ch;
        while ((ch = System.in.read()) != -1)
        {
        	if (System.in.available() > 0 )
        		System.out.println("jest");
            if (ch != '\n' && ch != '\r')
            {
                System.out.println(((char)ch));
            }
        }

	}

	private static void bubbleSort(int[] array) {
		boolean flag;
		int swap = 0;

		for (int i = 0; i < array.length - 1; i++) {
			flag = false;
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					System.out.printf("Swap %d and %d%n", array[j], array[j + 1]);
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true;
					swap++;
					System.out.println(Arrays.toString(array));
				}
			}
			if (!flag)
				break;
		}
		System.out.println("\nSwap = " + swap);
	}

}
