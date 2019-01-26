package abstractClass;

public class PetShop {

	public static void main(String[] args) {
		
		Fish f1 = new Fish("Dory");
		Cat c1 = new Cat("Tom");
		Dog d1 = new Dog("Jimmy");
		
		System.out.println("Hello... I am " + f1.getName());
		System.out.println(f1.iCanDo());
		
		System.out.println("Hello... I am " + c1.getName());
		System.out.println(c1.iCanDo());
		
		System.out.println("Hello... I am " + d1.getName());
		System.out.println(d1.iCanDo());
		

	}

}
