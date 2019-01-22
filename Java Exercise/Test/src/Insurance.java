
public class Insurance {
	
	public static final boolean MEN = true;
	public static final boolean FEMALE = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println( insuranceCalk(12, FEMALE));
		

	}
	
	
	public static int insuranceCalk(int age, boolean male) {
		// TODO Calculate discount
		int discount;
		
		// Out of range age => throw exception
		if (age < 17 || age > 150)
			throw new IllegalArgumentException("There are no drivers aged " + age);
		
		if ( age <= 21 )
			discount = 0;
		else if ( age <= 35 )
			discount = 3;
		else
			discount = 5;
		
		if ( male  == FEMALE )
			discount *= 2;

		return discount;
	}

}
