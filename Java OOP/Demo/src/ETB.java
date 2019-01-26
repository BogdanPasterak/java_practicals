
public class ETB {

	// instance variable
	int regNo;
	String stuName;
	int age;
	
	public static final String COURSE_NAME = "Software Developers";
	private static int initRegNo = 100;
	
	// constructors
	public ETB() {
		regNo = ++initRegNo;
		stuName = "Leo";
		age = 25;
	}

	public ETB(String _stuName, int _age) {
		regNo = ++initRegNo;
		stuName = _stuName;
		age = _age;
	}

	// getters and setters
	public int getRegNo() {
		return regNo;
	}


	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// members
	
}
