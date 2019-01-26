package interfaces;

import java.util.Arrays;

public class Dog implements Animal, Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		
		System.out.println("Pet");
		Pet pet = new Pet() {
			public void slip(int z) {
				System.out.print("Pet slip ");
				for (int i = 0; i < z; i++) 
					System.out.println("z.. ");
				System.out.println();
			}
		};
		
		pet.eat();
		//pet.slip(3);
		System.out.println();
		System.out.println(Arrays.toString(pet.getClass().getDeclaredMethods()));
		System.out.println(dog instanceof Dog);
		
		Animal animal = new Animal() {
			@Override 
			public void walk() {
				System.out.println("Animal walk");
			}
		};

		System.out.println("Animal");
		animal.eat();
		animal.walk();
		
	}
	
	
	
	@Override
	public void walk() {
		System.out.println("Dog walk");
	}



	@Override
	public void eat() {
		Animal.super.eat();
	}

}
