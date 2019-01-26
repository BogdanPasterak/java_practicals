package inherit;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//import java.util.Arrays;

public class GrandChildCar extends ChildCar {

	public GrandChildCar() {
		super();
		System.out.println("GrandChildClass - Ford Fiesta");
	}

	public void brand() {
		System.out.println("Fort - Fiesta");
	}

	public void speed() {
		System.out.println("Speed: 96-122 mph");
	}

	public static void main(String[] args) {
		GrandChildCar car = new GrandChildCar();
		car.vehicleType();
		car.brand();
		car.speed();
		System.out.println();
		//((ChildCar)car).brand();
		
		// invoke to overriding method brand();

		//java.lang.reflect.Method m;
		//Constructor<?> cons;

//		try {
//
//			m = car.getClass().getSuperclass().getMethod("brand");
//
//			cons = car.getClass().getSuperclass().getConstructor();
//
//			//m.invoke(cons.newInstance(null));
//
//		} catch (Exception e) {
//			
//			System.out.println(e.getMessage());
//			
//		}
		

	}

}
