
abstract public class AClass {
	private String name;
	
	public AClass(String name) {
		this.name = name;
	}
	
	abstract public void AClass(String name, boolean b);
	
	public static void main(String[] args) {
		BClass b = new BClass("name");
		b.AClass(null, false);
		
	}
	
}

class BClass extends AClass{

	public BClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AClass(String name, boolean b) {
		System.out.println("Overriding abstract metod");
	}
	
	
}
