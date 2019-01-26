
public class Dog {
	
	// fields
	String breed;
	String size;
	int age;
	String colour;
	
	// Constructors
	public Dog() {
		System.out.println("Default Constructor");
	}
	

	public Dog(String breed, String size, int age, String colour) {
		this.breed = breed;
		this.size = size;
		this.age = age;
		this.colour = colour;
	}

	// methods
	
	// setters 
	public void setBreed(String _breed) {
		breed = _breed;
	}
	public void setSize(String _size) {
		size = _size;
	}
	public void setAge(int _age) {
		age = _age;
	}
	public void setColour(String _colour) {
		colour = _colour;
	}
	
	// getters
	public String getBreed() {
		return breed;
	}
	public String getSize() {
		return size;
	}
	public int getAge() {
		return age;
	}
	public String getColour() {
		return colour;
	}
	
	
	public void eat() {
		System.out.println("Eating ....");
	}
	public void sleep() {
		System.out.println("Sleeping ....");
	}
	public void sit() {
		System.out.println("Sitting ....");
	}
	public void run() {
		System.out.println("Running ....");
	}
	
	@Override
	public String toString() {
		String info = "[ " + this.getClass() + ", ";
		info += "breed - " + breed + ", ";
		info += "size - " + size + ", ";
		info += "age - " + age + ", ";
		info += "colour - " + colour + " ]";
		return info;
	}

	public static void main(String[] args) {
		//
		/*
		Dog d1,d2;
		
		d1 = new Dog();
		d2 = new Dog();
		Dog d3 = new Dog();
		*/
		
		Dog d4 = new Dog();
		Dog d5 = new Dog("Pom", "Small", 5, "White");
		System.out.println("Details of Dog d4");
		System.out.println("The Age is   : " + d4.getAge());
		System.out.println("The Breed is : " + d4.getBreed());
		System.out.println("The Colour is: " + d4.getColour());
		System.out.println("The Size is  : " + d4.getSize());
		System.out.println("Details of Dog d5");
		System.out.println("The Age is   : " + d5.getAge());
		System.out.println("The Breed is : " + d5.getBreed());
		System.out.println("The Colour is: " + d5.getColour());
		System.out.println("The Size is  : " + d5.getSize());
		
		/*
		
		d1.setBreed("Mastiff");
		d1.setSize("Large");
		d1.setColour("Black");
		d1.setAge(5);
		
		d2.setBreed("Maltese");
		d2.setSize("Small");
		d2.setColour("White");
		d2.setAge(2);
		
		d3.setBreed("Chow Chow");
		d3.setSize("LMedium");
		d3.setColour("Brown");
		d3.setAge(3);
		
		System.out.println("Details of Dog d1");
		System.out.println("The Age is   : " + d1.getAge());
		System.out.println("The Breed is : " + d1.getBreed());
		System.out.println("The Colour is: " + d1.getColour());
		System.out.println("The Size is  : " + d1.getSize());
		d1.eat();
		d1.sleep();
		d1.run();
		d1.sit();
		
		d2.breed = "Maltese";
		d2.size = "Small";
		d2.colour = "White";
		d2.age = 2;

		System.out.println(d2);
		*/

	}

}
