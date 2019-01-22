
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = Double.parseDouble("1");
		
		System.out.println(d);
		
		System.out.println("".getClass());
		
		MyO[] t = new MyO[3];
		
		for (int i = 0; i < 3; i++) {
			//t[i] = new MyO(i);
		}
		
		
	}
	
	public class MyO {
		public MyO2[] u = new MyO2[2];
		public MyO (int y) {
			u[0] = new MyO2(y);
			u[1] = new MyO2(y + 1);
		}
	}

	public class MyO2 {
		public int[] v = new int[1];
		public MyO2(int x) {
			v[0] = x;
		}
	}

}

