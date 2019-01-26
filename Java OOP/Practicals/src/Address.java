public class Address {

	String add1;
	String add2;
	String add3;
	String town;
	
	public Address(String add1In, String add2In, String add3In, String townIn)
	{
		
		add1 = add1In;
		add2 = add2In;
		add3 = add3In;
		town = townIn;
		
	}
	
	public String toString()
	{
		
		String retString = "Add Line #1: " + add1 + "\n";
		retString = retString + "Add Line #2: " + add2 + "\n";
		retString = retString + "Add Line #3: " + add3 + "\n";
		retString = retString + "Town: " + town + "\n";
		return retString;
		
	}
	
}
