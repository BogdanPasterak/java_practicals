package differentCoat;

import java.util.Arrays;
import java.util.Scanner;

public class MyScanner {
	private static Scanner scanner = new Scanner(System.in);
	
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
		return null;
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
			message = "  Enter height and size ( h.h  s.s ): ";
			break;
		case 'R':
			message = "  Enter height, lenght and width ( h.h  l.l  w.w ): ";
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
				dimensionsStrings = Arrays
						.stream(enter.split("[- /:;,*\\t]"))
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
		System.out.println("\n  Change calculations (Enter - skip)");
		System.out.println("  --- Choice of room type ---");
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

}
