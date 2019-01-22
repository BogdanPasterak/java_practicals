
public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int grade = 50; int neededToPass = 40;
		 * 
		 * if (grade >= neededToPass) ;
		 * 
		 * int passedBy = grade - neededToPass; // Declared Inside IF Statement
		 * System.out.println("You passed by " + passedBy + "%");
		 * 
		 * int age = 60; int retirementAge = 65;
		 * 
		 * if (age >= retirementAge) //If This Condition Evaluates To True (It Wont),The
		 * Code In Braces Will Be Run System.out.println("Enjoy Your Retirement");
		 * else//If The Conditional Expression In The Above IF Evaluates To False, The
		 * Code In Braces Will Be Run System.out.println("Keep On Working");
		 * 
		 * 
		 * int exampScore = 82; char grade; if ( exampScore >=60) { grade = 'D'; } else
		 * if ( exampScore >=90) { grade = 'A'; } else if ( exampScore >=80) { grade =
		 * 'B'; } else if ( exampScore >=70) { grade = 'C'; } else { grade = 'F'; }
		 * 
		 * System.out.println("The grade is " + grade);
		 * 
		 * int gradeEntered = 100;
		 * 
		 * if(gradeEntered >= 0) { if(gradeEntered <= 100) {
		 * System.out.println("Valid Grade Entered."); }
		 * 
		 * else //gradeEntered > 100 {
		 * System.out.println("Grade Entered Exceeds Maximum [100]."); } } else
		 * //gradeEntered < 0 {
		 * System.out.println("Grade Entered Is Less Than Minimum [0]."); }
		 * 
		 * int age = 35; char gender = 'F'; // M - Male, F - Female
		 * 
		 * if( age > 35 ) // outer if { if( gender == 'M' ) // LINE A {
		 * System.out.println("Man"); } else { System.out.println("Woman"); } } else {
		 * if( gender == 'M' ) // LINE B { System.out.println("Boy"); } else {
		 * System.out.println("Girl"); } }

		int test = 1;

		switch (test) {
		case 1:
			System.out.println("1 - " + test);
			test++;
			//break;
		case 2:
			System.out.println("2 - " + test);
			//break;
		default:
			System.out.println("default " + test);
			break;
		}
		 */
		
        String Grade ="";  
        switch (Grade){  
        case "A":  
            System.out.println("You are Grade A Employee: Bonus= "+ 2000);  
            break;  
        case "B":  
            System.out.println("You are Grade B Employee: Bonus= "+ 1000);  
            break;  
        case "":  
            System.out.println("You are Grade C Employee: Bonus= "+ 500);  
            break;  
        default:  
            System.out.println("You are Default Employee: Bonus= "+ 100);  
            break;  
        }         


	}

}
