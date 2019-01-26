package interfaces;

public class Cclass extends Sclass implements A,  B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(x);
		System.out.println(A.x);
		System.out.println(B.x);
		Cclass c = new Cclass();
		c.name();
		c.m1();
		c.mehodFromInterface();
		A.interF();
		B.interF();
		//c.interF();
		c.sClass();
		
	}

//	@Override
//	public void name() {
//		System.out.println("Child class name method");
//		
//	}

	@Override
	public void m1() {
		System.out.println("overaiding method m1 from interfaces A and B");
	}

	@Override
	public void mehodFromInterface() {
		// TODO Auto-generated method stub
		A.super.mehodFromInterface();
	}


}
