import java.time.LocalDate;

/**
 * 
 * @author Bogdan Pasterak
 * Assessment Object Oriented Programing JAVA
 * Level 3 (7540-037/7630-321)
 * 28 Jan 2019
 *
 */
// class newDate according to the convention, it should be called NewDate
public class newDate {
	
	// Validate Date
	public boolean validDate (int day, int month, int year) {
		
		// range of valid year
		if (year >= 1000 && year <= 3000)
			// range of valid month
			if (month >= 1 && month <= 12)
				// range of valid day depending of month and year
				if(day >= 1 && day <= daysInMonth(month, year))
					// success !
					return true;
		
		return false;
	}

	// Checking if the year is leap
	public boolean leapYear (int year) {
		// initial assumption that no
		boolean leap = false;
		
		// Leap year can be evenly divided by 4
		if (year % 4 == 0)
			// and not by 100 , excluding evenly divided by 400
			if (year % 100 != 0 || year % 400 == 0)
				leap = true;
		
		return leap;
	}
	
	public int julianDate (int day, int month, int year) {
		
		// protect against bad date
		if ( validDate(day, month, year) ) {
			// the number of days is equal to the current day and ...
			int number = day;
			
			// total days in the preceding months
			for (int m = 1; m < month ; m++) {
				// adding days
				number += daysInMonth(m, year);
			}

			return number;
		// invalid date return 0
		} else {
			return 0;
		}
	}
	
	public int daysElapsed (int day1, int month1, int year1,
							int day2, int month2, int year2) {
		// protect against bad date
		if ( validDate(day1, month1, year1) && validDate(day2, month2, year2) ) {
		// if date1 > date 2 
			boolean negative = false;
			int days = 0;
			
			// checking the order of dates
			if (year1 > year2)
				negative = true;
			else if (year1 == year2) {
				if (month1 > month2)
					negative = true;
				else if (month1 == month2 && day1 > day2)
					negative = true;
			}
			// if bad order , swap date
			if (negative) {
				int temp = day1;
				day1 = day2;
				day2 = temp;
				temp = month1;
				month1 = month2;
				month2 = temp;
				temp = year1;
				year1 = year2;
				year2 = temp;
			}
			
			// dyfference between Julian date 
			days = julianDate(day2, month2, year2) - julianDate(day1, month1, year1);
			
			// adding full years
			for (int y = year1; y < year2; y++) {
				days += (leapYear(y)) ? 366 : 365;
			}
			
			// for bad order negative number of days
			if (negative)
				return -days;
			else
				return days;
		// invalid date return 0
		} else {
			return 0;
		}
	}
	
	public int ageDate (int dayBirth, int monthBirth, int yearBirth) {
		// protect against bad date
		if ( validDate(dayBirth, monthBirth, yearBirth) ) {
			int years = 0;
			
			// get current date
			LocalDate now = LocalDate.now();
			int day = now.getDayOfMonth();
			int month = now.getMonthValue();
			int year = now.getYear();
			
			years = year - yearBirth;
			
			// if Birth Day don't pass
			if ( monthBirth > month || ( monthBirth == month && dayBirth > day ) )
				years--;

			// Happy Birthday
			if ( monthBirth == month && dayBirth == day )
				System.out.println("Happy Birthday !");
			
			// date later than today
			if (yearBirth > year ||
				(yearBirth == year && monthBirth > month) ||
				(yearBirth == year && monthBirth == month && dayBirth > day))
				years = 0;
			
			return years;
		// invalid date return 0
		} else {
			return 0;
		}
	}
	
	// method that returns the number of days in a month
	private int daysInMonth(int month, int year ) {
		
		boolean leap = leapYear(year);
		
		switch (month) {
		// mounths with 31 days
		case 1: case 3: case 5:case 7: case 8: case 10: case 12:
			return 31;
		// mounths with 30 days
		case 4: case 6: case 9: case 11:
			return 30;
		// February depending on leap year
		case 2:
			if (leap)
				return 29;
			else
				return 28;
		default:
			return 0;
		}
	}

}
