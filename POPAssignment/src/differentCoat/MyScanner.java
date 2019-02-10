package differentCoat;

import java.util.Arrays;
import java.util.Scanner;

public class MyScanner {
	private static Scanner scanner = new Scanner(System.in);
	private static String prefix;
	private static String subscriber;
	
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

		do {
			System.out.print(message);
			enter = scanner.nextLine().trim();
	
			if (enter.isEmpty())
				System.out.println("  You have to enter some dimensions.");
			else {
				// Stream - new Class Java 8
				dimensionsStrings = Arrays
						.stream(enter.split("[- /:;,*\\t\\\\]"))
						.filter(s -> s.length()>0)
						.toArray(String[]::new);
				if ((dimensionsStrings.length == 2 && (roomType == 'S' || roomType == 'C'))
						|| (dimensionsStrings.length == 3 && roomType == 'R' )) {
					ok = true;
					for (String dimension : dimensionsStrings) {
						ok = ok && isDouble(dimension);
					}
					if ( ok ) {
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

	public static Character getRoomTypeOrEmpty() {
		String enter;
		char room = 'X';
		
		System.out.println("\n  --- Choice of room type (Enter - skip)---");
		System.out.println("  S: Square shape room");
		System.out.println("  R: Rectangular shape room");
		System.out.println("  C: Cylindrical shape room");
		
		do {
			System.out.print("    Enter type of room: ");
			
			enter = scanner.nextLine().trim().toUpperCase();
			
			if (enter.isEmpty())
				return null;
			else {
				room = enter.charAt(0);
				if (room != 'S' && room != 'R' && room != 'C')
					System.out.println("    We do not have that type.");
			}
			
		} while (room != 'S' && room != 'R' && room != 'C');
		return room;
	}
	
	public static String getPhone(boolean canSkip) {
		String enter;

		do {
			System.out.print("  Enter the customer's phone No (0XX XXX XXXX)" +
					 ((canSkip) ? " (Enter - skip): ": ": " ));
			enter = scanner.nextLine().trim();
			
			if (enter.isEmpty()) {
				if (canSkip)
					return enter;
				else
					System.out.println("  You have to enter some phone No.");
			} else {
				if (validatePhone(enter))
					return enter;
				else
					System.out.println("Invalid number.");
			}
		} while (true);
		
	}
	
	public static boolean validatePhone(String phone) {
		String[] parts;
		
		// Stream - new Class Java 8
		parts = Arrays
				// change to steram Array of String ( split(RegEx))
				.stream(phone.split("[- /.:;,*\\t]"))
				// remove empty String
				.filter(s -> s.length() > 0)
				// change to String[]
				.toArray(String[]::new);
		// secound and third stick together
		if (parts.length == 3)
			parts[1] += parts[2];
		// only 2 or 3 parts
		if (	(parts.length < 1 || parts.length > 3) ||
				// first parts length (from 01 to 00353401)
				(parts[0].length() > 8 || parts[0].length() < 2) ||
				// second parts length beetwen 5 and 7
				(parts[1].length() > 7 || parts[1].length() < 5) ) {
			return false;
		} else {
			// proper size
			// remove prefix to next validation
			// +3531 or +353401 
			if (parts[0].charAt(0) == '+' && parts[0].length() >= 5 && parts[0].substring(1, 4).equals("353") ) {
				parts[0] = parts[0].substring(4);
				// or 0035374 
			} else if (parts[0].length() >= 6 && parts[0].substring(0, 5).equals("00353") ) {
				parts[0] = parts[0].substring(5);
				// or 074
			} else if (parts[0].charAt(0) == '0' ) {
				parts[0] = parts[0].substring(1);												
			} else {
				return false;
			}
			// System.out.println(parts[0] + " " + parts[1]);
			// validate numbers
			if (parts[0].matches("[0-9]{1,3}") && parts[1].matches("[0-9]{5,7}")) {
				// Dublin
				if ((parts[0].charAt(0) == '1' && parts[0].length() == 1) ||
						// Cork
						(parts[0].charAt(0) == '2' && parts[0].length() == 2 && parts[0].substring(1).matches("[123456789]")) ||
						// more valid number
						(parts[0].charAt(0) == '4' && parts[0].length() == 3 && parts[0].charAt(1) == '0' && parts[0].substring(2).matches("[14]")) ||
						(parts[0].charAt(0) == '4' && parts[0].length() == 2 && parts[0].substring(1).matches("[179]")) ||
						(parts[0].charAt(0) == '5' && parts[0].length() == 3 && parts[0].charAt(1) == '0' && parts[0].substring(2).matches("[45]")) ||
						(parts[0].charAt(0) == '5' && parts[0].length() == 2 && parts[0].substring(1).matches("[1-9]")) ||
						(parts[0].charAt(0) == '6' && parts[0].length() == 2 && parts[0].substring(1).matches("[1-9]")) ||
						(parts[0].charAt(0) == '7' && parts[0].length() == 2 && parts[0].substring(1).matches("[14]")) ||
						(parts[0].charAt(0) == '9' && parts[0].length() == 2 && parts[0].substring(1).matches("[0-9]")) ||
						// mobile
						(parts[0].charAt(0) == '8' && parts[0].length() == 2 && parts[0].substring(1).matches("[35679]") && parts[1].length() == 7) )
					return true;
			}
		}
	
		return false;
	}
	
	// https://en.wikipedia.org/wiki/Telephone_numbers_in_the_Republic_of_Ireland
	public static boolean validatePhoneNo(String phone) {
		
		phone = phone.replaceAll("[- /.:;,*\\t]", "");
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
	
	public static String formatPhoneNo(String phone) {
		if ( validatePhoneNo(phone))
			return prefix + " " + subscriber.substring(0, 3) + " " + subscriber.substring(3);
		else
			return null;
	}
	
	

}
