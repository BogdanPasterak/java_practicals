package differentCoat;

import java.util.Arrays;
import java.util.Scanner;

public class MyScanner {
	private static Scanner scanner = new Scanner(System.in);
	private static String prefix;
	private static String subscriber;
	
	// get int form 0 to 6
	public static int getInt06() {
		int answer = -1;
		
		// between 0 and 6 
		do {
			answer = getInt("Enter number ( 0 - 6 ): ");
			
			if (answer < 0 || answer > 6)
				System.out.println("Number outside the allowed range.");
		} while (answer < 0 || answer > 6);
		
		return answer;
	}
	
	// get int
	public static int getInt(String message) {
		String enter;
		int answer = -1;
		
		// loop until get correct value
		do {
			System.out.print(message);
			enter = scanner.nextLine();
			
			if (enter.trim().isEmpty())
				System.out.println("You have to choose some options.");
			else {
				try {
					answer = Integer.parseInt(enter);
				} catch (NumberFormatException e) {
					System.out.println("You must give the number.");
				}
			}			
		} while (answer == -1);
		
		return answer;
	}

	// get Srting ( not empty )
	public static String getString(String message) {
		String enter;
		
		do {
			System.out.print(message);
			enter = scanner.nextLine();
			if (enter.trim().isEmpty())
				System.out.println("You have to enter some text.");
		} while (enter.trim().isEmpty());
		return enter;
	}

	// only s, r or c character avaliable, lower or upper case
	public static char getRoomType() {
		String enter;
		char room = 'X';
		
		System.out.println("\n  --- Choice of room type ---");
		System.out.println("  S: Square shape room");
		System.out.println("  R: Rectangular shape room");
		System.out.println("  C: Cylindrical shape room");
		
		do {
			System.out.print("    Enter type of room: ");
			
			enter = scanner.nextLine().trim().toUpperCase();
			
			if (enter.isEmpty())
				System.out.println("    You have to enter some type.");
			else {
				room = enter.charAt(0);
				if (room != 'S' && room != 'R' && room != 'C')
					System.out.println("    We do not have that type.");
			}
			
		} while (room != 'S' && room != 'R' && room != 'C');
		return room;
	}

	// get 2 or 3 dimensions of room
	public static double[] getDimensions(char roomType) {
		double[] dimensions;
		String[] dimensionsStrings;
		String message, enter;
		boolean ok = false;
		
		System.out.println("\n  --- Enter of dimensions ---");
		// Appropriate message
		switch (roomType) {
		case 'S':
			message = "  Enter height and length ( h.h  l.l ): ";
			break;
		case 'R':
			message = "  Enter height, length and width ( h.h  l.l  w.w ): ";
			break;
		case 'C':
			message = "  Enter height and diameter ( h.h  d.d ): ";
			break;
		default:
			message = "  No Data";
		}

		// until type proper value
		do {
			System.out.print(message);
			enter = scanner.nextLine().trim();
	
			if (enter.isEmpty())
				System.out.println("  You have to enter some dimensions.");
			else {
				// Stream - new Class Java 8
				// build String array
				dimensionsStrings = Arrays
						.stream(enter.split("[- /:;,*\\t\\\\]"))
						.filter(s -> s.length()>0)
						.toArray(String[]::new);
				// number of variable
				if ((dimensionsStrings.length == 2 && (roomType == 'S' || roomType == 'C'))
						|| (dimensionsStrings.length == 3 && roomType == 'R' )) {
					ok = true;
					// if all are numbers
					for (String dimension : dimensionsStrings) {
						ok = ok && isDouble(dimension);
					}
					if ( ok ) {
						// message
						System.out.print("    You typed : ");
						dimensions = new double[dimensionsStrings.length];
						for (int i = 0; i < dimensionsStrings.length; i++) {
							dimensions[i] = Double.parseDouble(dimensionsStrings[i]);
							System.out.print(dimensions[i]);
							if ( i + 2 == dimensionsStrings.length)
								System.out.print(" and ");
							else if ( i + 1 == dimensionsStrings.length)
								System.out.print(" .");
							else
								System.out.print(" , ");
						}
						System.out.println();
						return dimensions;
					} else
						System.out.println("  Data is not numbers.");
				} else
					System.out.println("  Incompatible data quantity.");
			}
		} while ( ! ok );
		
		return null;
	}

	// test of String is double
	private static boolean isDouble(String dimension) {
		boolean is = true;
		
		try {
			Double.parseDouble(dimension);
		} catch (NumberFormatException e) {
			is = false;
		}
		
		return is;
	}

	public static String getStringOrEmpty(String message) {
		
		System.out.print(message);
		return scanner.nextLine().trim();
	}

	
	// only s, r, c or null Character avaliable
	public static Character getRoomTypeOrEmpty() {
		String enter;
		char room = 'X';
		
		// mini menu
		System.out.println("\n  --- Choice of room type (Enter - skip)---");
		System.out.println("  S: Square shape room");
		System.out.println("  R: Rectangular shape room");
		System.out.println("  C: Cylindrical shape room");
		
		do {
			System.out.print("    Enter type of room: ");
			
			enter = scanner.nextLine().trim().toUpperCase();
			
			if (enter.isEmpty())
				// skip
				return null;
			else {
				room = enter.charAt(0);
				// wrong option
				if (room != 'S' && room != 'R' && room != 'C')
					System.out.println("    We do not have that type.");
			}
			
		} while (room != 'S' && room != 'R' && room != 'C');
		return room;
	}
	
	// get valid phone No
	public static String getPhone(boolean canSkip) {
		String enter;

		do {
			System.out.print("  Enter the customer's phone No (0XX XXX XXXX)" +
					 ((canSkip) ? " (Enter - skip): ": ": " ));
			enter = scanner.nextLine().trim();
			
			if (enter.isEmpty()) {
				if (canSkip)
					return null;
				else
					System.out.println("  You have to enter some phone No.");
			} else {
				if (validatePhoneNo(enter))
					return formatPhoneNo(enter);
				else
					System.out.println("Invalid number.");
			}
		} while (true);
		
	}
	
	// https://en.wikipedia.org/wiki/Telephone_numbers_in_the_Republic_of_Ireland
	public static boolean validatePhoneNo(String phone) {
		
		phone = phone.replaceAll("[- /.:;,*\\t()]", "");
		if (phone.length() < 6)
			return false;
		// change prefix to '0'
		if ( phone.startsWith("00353") )
			phone = "0" + phone.substring(5);
		else if ( phone.startsWith("+353") )
			phone = "0" + phone.substring(4);
		
		if ( ! phone.matches("^[\\d]{7,11}$") )
		// if (phone.charAt(0) != '0')
			return false;
		// Dublin
		if (phone.matches("^(01).{5,7}$")) {
			prefix = phone.substring(0, 2);
			subscriber = phone.substring(2);
			return true;
		// more option
		} else if (phone.matches("^(02[1-9]).{5,7}$")) {
			prefix = phone.substring(0, 3);
			subscriber = phone.substring(3);
			return true;
		} else if (phone.matches("^(040[24]).{5,7}$")) {
			prefix = phone.substring(0, 4);
			subscriber = phone.substring(4);
			return true;
		} else if (phone.matches("^(04[1-79]).{5,7}$")) {
			prefix = phone.substring(0, 3);
			subscriber = phone.substring(3);
			return true;
		} else if (phone.matches("^(050[45]).{5,7}$")) {
			prefix = phone.substring(0, 4);
			subscriber = phone.substring(4);
			return true;
		} else if (phone.matches("^(05[1-9]).{5,7}$")) {
			prefix = phone.substring(0, 3);
			subscriber = phone.substring(3);
			return true;
		} else if (phone.matches("^(06[1-9]).{5,7}$")) {
			prefix = phone.substring(0, 3);
			subscriber = phone.substring(3);
			return true;
		} else if (phone.matches("^(07[14]).{5,7}$")) {
			prefix = phone.substring(0, 3);
			subscriber = phone.substring(3);
			return true;
		} else if (phone.matches("^(09[0-9]).{5,7}$")) {
			prefix = phone.substring(0, 3);
			subscriber = phone.substring(3);
			return true;
		// mobile
		} else if (phone.matches("^(08[35679]).{7}$")) {
			prefix = phone.substring(0, 3);
			subscriber = phone.substring(3);
			return true;
		}
		return false;
	}
	
	// change format phone No to proper if not return null
	public static String formatPhoneNo(String phone) {
		if ( validatePhoneNo(phone))
			return prefix + " " + subscriber.substring(0, 3) + " " + subscriber.substring(3);
		else
			return null;
	}
	
	

}