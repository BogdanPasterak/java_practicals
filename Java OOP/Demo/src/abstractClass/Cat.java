package abstractClass;

public class Cat extends Pet {

	public Cat(String name) {
		super(name);
	}

	@Override
	public String iCanDo() {
		return "I can catch a mice";
	}

}
