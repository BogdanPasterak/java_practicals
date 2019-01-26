package employee;

public class Student {

	int rollNo;
	String name;
	int age;
	static int nextRollNo = 1000;
	
	public Student () {
		rollNo = ++nextRollNo;
	}

	public Student(String name, int age) {
		this();
		this.setName(name);
//		this.setAge(age);
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		this.show();
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void show() {
		System.out.println("\nDetails of the Students");
//		System.out.println("Student roolNo : " + this.getRollNo());
//		System.out.println("Student  name  : " + this.getName());
//		System.out.println("Student   age  : " + this.getAge());
	}
	
	public static void main(String[] args) {
		Student s1, s2;
		
		s1 = new Student();
		s1.setName("Ross");
		s1.setAge(20);
		
		s2 = new Student("Bogdan", 50);
		
		System.out.println("\nStudent 1");
		System.out.println("Student roolNo : " + s1.getRollNo());
		System.out.println("Student  name  : " + s1.getName());
		System.out.println("Student   age  : " + s1.getAge());
		
		System.out.println("\nStudent 2");
		System.out.println("Student roolNo : " + s2.getRollNo());
		System.out.println("Student  name  : " + s2.getName());
		System.out.println("Student   age  : " + s2.getAge());

	}

}
