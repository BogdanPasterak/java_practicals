
public class TestBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 2;
		int y = 0b00110011;
		int z;
		
		z = x >> 2;
		
		System.out.println(z);
		System.out.println(Integer.toUnsignedString(z, 2));
		System.out.println(String.format("%32s", Integer.toBinaryString(z)).replace(' ', '0'));
		System.out.println(intToString(z, 4));
		
		x = 20;
		y = 10;
		
		z= x++ - y * 7 / --y + x * 10;
		
		System.out.println(z);
		
	}
	
	public static String intToString(int number, int groupSize) {
	    StringBuilder result = new StringBuilder();

	    for(int i = 31; i >= 0 ; i--) {
	        int mask = 1 << i;
	        result.append((number & mask) != 0 ? "1" : "0");

	        if (i % groupSize == 0)
	            result.append(" ");
	    }
	    result.replace(result.length() - 1, result.length(), "");

	    return result.toString();
	}


}
