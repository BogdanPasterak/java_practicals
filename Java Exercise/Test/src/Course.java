import myScanner.MyScanner2;

public class Course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable
		String courseName = "Software Development";
		String[] studentName = new String[10];
		String[] staffName = {"Paul","Angela","Denis"};
		
		
		System.out.println("Enter students name");
		for (int i = 0; i < studentName.length; i++) {
			studentName[i] = " nr. " + (i + 1) + "  " + MyScanner2.getString("Student No " + (i + 1) + " name : ", MyScanner2.STRINGS.NAME);
		}
		
		System.out.println("\nCourse   Name: " + courseName);
		System.out.println("Staff    Name: " + staffName[1]);
		System.out.println("Student in the class :");
		
		for (String student : studentName) {
			System.out.println("\t" + student);
		}
		
	}

}
