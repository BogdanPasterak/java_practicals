import myScanner.MyScanner2;

public class GradesStatistic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grades = {};
		
		grades = readGrades(grades);
		printGrades(grades);
		System.out.printf("The avarage is %.2f\n", avarage(grades));
		System.out.println("The max grade is " + max(grades));
		System.out.println("The min grade is " + min(grades));
		grades = sort(grades);
		System.out.print("Sorted ");
		printGrades(grades);
		System.out.printf("The median is %.2f\n", median(grades));
		
	}

	public static int[] sort(int[] array) {
		// inserting sort
		int indexMax, temp;
		for (int last = array.length - 1; last > 0; last--) {
			indexMax = last;
			for (int each = 0; each < last; each++) {
				if ( array[each] > array[indexMax] )
					indexMax = each;
			}
			// swap
			temp = array[last];
			array[last] = array[indexMax];
			array[indexMax] = temp;
		}
		
		return array;
	}

	public static double median(int[] array) {
		
		int median;
		
		if (array.length % 2 == 0)
			median = ( array[array.length / 2] + array[array.length / 2 - 1] ) / 2;
		else
			median = array[array.length / 2];
		
		
		return median;
	}

	public static int min(int[] array) {
		
		int min = array[0];
		for (int each : array)
			if(each < min)
				min = each;
		
		return min;
	}

	public static int max(int[] array) {
		
		int max = array[0];
		for (int each : array)
			if(each > max)
				max = each;
		
		return max;
	}

	public static double avarage(int[] array) {
		double avarage = 0;
		
		for (int grade : array) 
			avarage += grade;
		avarage /= array.length;
		
		return avarage;
	}

	public static void printGrades(int[] array) {
		
		System.out.print("Grades: [");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
		}
		System.out.println("Number of students: " + array.length);
	}

	public static int[] readGrades(int[] array) {
		int n;
		
		n = MyScanner2.getInt("Enter the number of students: ",1, 10);
		array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = MyScanner2.getInt("Enter the grade for student: ", 100);
		}
		
		return array;
	}

}
