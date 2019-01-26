package exeption;

public class TestNewExeption {

	public static void main(String[] args) {
		System.out.println("Welcome !!");
		try {
			checkEligibilty(20, 80);
			checkEligibilty(10, 80);
		} catch (InvalidRegistrationException e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("Bye, Bye");			
		}

	}
	
	public static void checkEligibilty(int age, int weight) throws InvalidRegistrationException {
		if (age < 12 || weight < 40) {
			throw new InvalidRegistrationException("Student is no eligible to registration");
		} else {
			System.out.println("Student Entry is valid");
		}
	}

}
