public class Employee {

	int employeeNumber;
	String employeeName;
	String ppsNo;
	String jobTitle;
	Address address;
	double salary;
	
	public Employee(int empNoIn, String empNameIn, String ppsNoIn, String jobTitleIn, Address addressIn, double salaryIn)
	{
		
		employeeNumber = empNoIn;
		employeeName = empNameIn;
		ppsNo = ppsNoIn;
		jobTitle = jobTitleIn;
		address = addressIn;
		salary = salaryIn;
		
	}
	
	public Employee(int empNoIn, String empNameIn, String ppsNoIn, String jobTitleIn, String aL1, String aL2, String aL3, String townIn, double salaryIn)
	{
		
		employeeNumber = empNoIn;
		employeeName = empNameIn;
		ppsNo = ppsNoIn;
		jobTitle = jobTitleIn;
		address = new Address(aL1, aL2, aL3, townIn);
		salary = salaryIn;
		
	}
	
	public double getSalary()
	{
		
		return salary;
		
	}
	
	public void payRise()
	{
		
		if(salary < 50000)
		{
			
			salary = salary + 5000;
			
		}
		
		else
		{
			
			salary = salary + 2500;
			
		}
	
	}
	
	public String toString()
	{
		
		/*
		 	Emp No: 12345
			Name: Shaun Mc Brearty
			PPS No: 8039061Q
			Job Title: Course Tutor
			Add Line #1: 45 Ballymacool Park
			Add Line #2: 
			Add Line #3
			Town: Letterkenny
			Salary: 20000
		 */
		
		String retString = "Emp No: " + employeeNumber + "\n";
		retString = retString + "Name: " + employeeName + "\n";
		retString = retString + "PPS No: " + ppsNo + "\n";
		retString = retString + "Job Title: " + jobTitle + "\n";
		retString = retString + address.toString();
		retString = retString + "Salary: " + salary;
		
		return retString;
		
	}

	
}
