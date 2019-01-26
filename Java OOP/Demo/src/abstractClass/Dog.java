package abstractClass;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
	}

	@Override
	public String iCanDo() {
		return "I can guard the house";
	}

}
