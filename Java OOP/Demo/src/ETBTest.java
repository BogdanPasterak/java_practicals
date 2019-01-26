
public class ETBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ETB st1 = new ETB();
		ETB st2 = new ETB("Jack", 23);
		ETB st3 = new ETB();
		
		
		st3.setStuName("Ram");
		st3.setAge(19);
		
		System.out.println(ETB.COURSE_NAME);
		
		System.out.println("Student 1 Details");
		System.out.println(st1.getRegNo());
		System.out.println(st1.getStuName());
		System.out.println(st1.getAge());

		System.out.println("Student 2 Details");
		System.out.println(st2.getRegNo());
		System.out.println(st2.getStuName());
		System.out.println(st2.getAge());

		System.out.println("Student 3 Details");
		System.out.println(st3.getRegNo());
		System.out.println(st3.getStuName());
		System.out.println(st3.getAge());

	}

}
