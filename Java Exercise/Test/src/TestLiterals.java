
public class TestLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = 100,
			oct = 0100,
			hex = 0x100,
			bin = 0b100;
		double d = 2e-2d;
		
		double	test1 = 101.234,
				test2 = 0101.342;
		// double	test3 = 0x101.642; Error
		
		System.out.println("Decymal   100 = " + dec);
		System.out.println("Octal    0100 = " + oct);
		System.out.println("Hexadec 0x100 = " + hex);
		System.out.println("Binary  0b100 = " + bin + "\n");
		
		dec = 101;
		oct = 0100;
		hex = 0xFace;
		bin = 0b1111;

		System.out.println("Decymal    101 = " + dec);
		System.out.println("Octal     0100 = " + oct);
		System.out.println("Hexadec 0xFace = " + hex);
		System.out.println("Binary  0b1111 = " + bin + "\n");
		
		System.out.println("double = " + d);
		System.out.println("Test1 double  101.234 = " + test1);
		System.out.println("Test1 double 0101.234 = " + test2);

	}

}
