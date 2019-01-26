package practical_2;

public class Address {

	String add1, add2, add3, town;
	
	public Address (String add1In, String add2In, String add3In, String townIn)
	{
		add1 = add1In;
		add2 = add2In;
		add3 = add3In;
		town = townIn;
	}
	
	@Override
	public String toString() {
		return	"Add Line #1: " + add1 + "\r\n" + 
				"Add Line #2: " + add2 + "\r\n" + 
				"Add Line #3: " + add3 + "\r\n" + 
				"Town: " + town + "\r\n";
	}

}
