package abstractClass;

public class Fish extends Pet {

	public Fish(String name) {
		super(name);
	}

	@Override
	public String iCanDo() {
		return "I can swim";
	}

}
