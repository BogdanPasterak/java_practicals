import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class MyTest extends Thread {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		//test( "Ala", "ma", "kota");
		Members.Init();
		
	}
	

	
	public static class Members {
		public static final String BOGDAN = "Bogdan";
		private static final String[] Bogdan = {"Moja","Imie","Jest","Tu"};
		public static final String JON = "Jon";
		public static final String RICHARD = "Richard";
		private static String[][] strings;
		
		public static void Init() throws InstantiationException, IllegalAccessException {
			if (strings == null) {
				
				Field[] fieldsPublic = Members.class.getFields();
				Field[] fields = Members.class.getDeclaredFields();
				String[] name = new String[fields.length];

				for (int i = 0; i < fieldsPublic.length; i++) {
					System.out.println("Public " + fieldsPublic[i].getName() );
				}
				System.out.println();
				
				for (int i = 0; i < fields.length; i++) {
					name[i] = fields[i].getName();
					System.out.println( name[i] );
					
				}
				System.out.println();
				
				fields[1].setAccessible(true);
				/*
				System.out.println("fields[0] = " + fields[0]);
				Class<Members> targetType = (Class<Members>) fields[0].getType();
				System.out.println("targetType = " + targetType);
				Object objValue = targetType.newInstance();
				
				System.out.println("objValue = " + objValue);
				*/
				Object value = fields[1].get( fields[1].getType() );
				System.out.println( Arrays.toString((String[])value));
				value = "Pasterak";
				System.out.println(value);
				
				
			}
		}
	}
	
	
	public static void test(String... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
	}
}

