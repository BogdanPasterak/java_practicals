package myScannerTest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import myScanner.MS;

public class MSTestGetInt {

	public static void main(String[] args) throws IOException {

		InputStream stdin = System.in;
		boolean allTest = true;

		String testS = "";
		int test;
		String[] answers = {
			// getInt( all params )
				// t01 , t02   			, t03    , t04   , t05             , t06           , t07         , t08
				"1\r\n", "a\r\n", "\r\n", "\r\n", "6\r\n", "a\r\n\r\n5\r\n", "-9\r\n-8\r\n", "9\r\n8\r\n", "5\r\n",
			// getInt( info, fill, topLimit ) 
				// t09 , t10    , t11
				"1\r\n", "3\r\n", "\r\n"
		};
		
		// set answers for tests
		for (String ans : answers) {
			testS += ans;
		}
		
		System.setIn(new ByteArrayInputStream(testS.getBytes()));
		
		// getInt( all params )

		System.out.println("Test t01 one entry");
		// Type 1 and Enter getInt( all params )
		test = MS.getInt("Enter some number : ", MS.ALLOW_FILL, 0 , 100);
		// result
		if (allTest = oneOf(test, allTest, 1))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		System.out.println("Test t02 two entry");
		// Type a retype Enter getInt( all params )
		test = MS.getInt("Enter some number : ", MS.ALLOW_FILL, 0 , 100);
		// result
		if (allTest = oneOf(test, allTest, 0, 100))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		System.out.println("Test t03 one entry");
		// Type Enter getInt( all params ) random only 5
		test = MS.getInt("Enter number 5", MS.ALLOW_FILL, 5 , 5);
		// result
		if (allTest = oneOf(test, allTest, 5))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		System.out.println("Test t04 one entry");
		// Type 6 Enter getInt( all params ) allows other
		test = MS.getInt("", MS.ALLOW_FILL, 5 , 5);
		// result
		if (allTest = oneOf(test, allTest, 6))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		System.out.println("Test t05 three entry");
		// Type a retype Enter retype 5 getInt( all params ) 
		test = MS.getInt("", MS.DONT_FILL, 2 , 8);
		// result
		if (allTest = oneOf(test, allTest, 5))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		System.out.println("Test t06 two entry");
		// Type -9 retype -8 getInt( all params ) 
		test = MS.getInt("Lower range", MS.DONT_FILL, -8 , -2);
		// result
		if (allTest = oneOf(test, allTest, -8))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		System.out.println("Test t07 two entry");
		// Type 9 retype 8 getInt( all params ) 
		test = MS.getInt("Upper range:", MS.DONT_FILL, 2 , 8);
		// result
		if (allTest = oneOf(test, allTest, 8))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		System.out.println("Test t08 one entry");
		// Type 5 getInt( all params ) bad range
		test = MS.getInt("Bad range:", MS.DONT_FILL, 8 , 2);
		// result
		if (allTest = oneOf(test, allTest, 5))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		// getInt( info, fill, topLimit )

		System.out.println("Test t09 one entry");
		// Type 1  
		test = MS.getInt("Type 0 or 1 or 2:", MS.ALLOW_FILL, 2);
		// result
		if (allTest = oneOf(test, allTest, 1))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		System.out.println("Test t10 one entry");
		// Type 3  
		test = MS.getInt("Type 0 or 1 or 2", MS.ALLOW_FILL, 2);
		// result
		if (allTest = oneOf(test, allTest, 3))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		System.out.println("Test t11 one entry");
		// Type Enter  
		test = MS.getInt("Type 0 or 1 or 2", MS.ALLOW_FILL, 2);
		// result
		if (allTest = oneOf(test, allTest, 0, 2))
			System.out.println(test + "\nPass");
		else
			System.out.println("\nFail   output = " + test);

		
		
		
		// back original setting
		System.setIn(stdin);
		System.out.println("All test = " + allTest);

	}

	
	public static boolean oneOf(int toTest, boolean before, int expect ) {
		
		if (!before)
			return false;
		
//		for (char ch : string.toCharArray()) {
//			if (toTest == ch)
//				return true;
//		}
		
		return expect == toTest;
	}
	public static boolean oneOf(int toTest, boolean before, int from, int to ) {
		
		if (!before)
			return false;
		else if(toTest >= from && toTest <= to)
			return true;
		
		return false;
	}

}
