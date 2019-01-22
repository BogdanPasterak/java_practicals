
public class CheckerBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7;
		for (int y = 0; y < n; y++) {
			if (y % 2 == 1)
				System.out.print(" ");
			for (int x = 0; x < n; x++) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}

}
