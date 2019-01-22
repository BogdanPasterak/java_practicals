
public class Q_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] board = { { 20, 15, 6, 19, 18 }, { 4, 46, 24, 17, 18 }, { 12, 50, 23, 16, 31 } };
		
		printMatrix(board);
		System.out.println();
		sumRows(board);
		System.out.println();
		largestInRows(board);
		
	}

	private static void largestInRows(int[][] board) {
		// TODO Auto-generated method stub
		int[] max = new int[board.length];

		for (int row = 0; row <board.length; row++) {
			max[row] = board[row][0];
			for (int each : board[row]) 
				if (each > max[row])
					max[row] = each;
			System.out.println("The largest element of row " + (row + 1) + " = " + max[row]);
		}
	}

	private static void sumRows(int[][] board) {
		
		int[] sumRows = new int[board.length];

		for (int row = 0; row <board.length; row++) {
			for (int each : board[row]) 
				sumRows[row] += each;
			System.out.println("The sum of row " + (row + 1) + " = " + sumRows[row]);
		}
	}

	private static void printMatrix(int[][] board) {
		// TODO Auto-generated method stub
		for (int[] row : board) {
			for (int each : row)
				System.out.print("\t" + ((each < 10)?" ":"") + each);
			System.out.println();
		}
	}

}
