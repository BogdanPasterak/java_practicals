package abstractClass;

public abstract class Pet {
	
	// variable
	private String name;

	public Pet(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String iCanDo();

}
