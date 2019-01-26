package practical_2;

public class Date {
	
	private int day, month, year;

	public Date(int dayIn, int monthIn, int yearIn)
	{
		day = dayIn;
		month = monthIn;
		year = yearIn;
	}
	
	public boolean validDate() {
		
		if (year >= 1000 && year < 2500)
			if (month >= 1 && month <= 12)
				if(day >= 1 && day <= daysInMonth(month, year))
					return true;
		
		return false;
	}
	

	private int daysInMonth(int monthNr, int year ) {
		
		boolean leap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
		
		switch (monthNr) {
		case 1: case 3: case 5:case 7: case 8: case 10: case 12:
			return 31;
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			if (leap)
				return 29;
			return 28;
		default:
			return 0;
		}
	}
	
	public String getJulianDate() {
		if ( validDate() ) {
			int number = day;
			
			for (int m = 1; m < month ; m++) {
				number += daysInMonth(m, year);
			}
			String end = " th";
			if (day % 10 == 1 && day != 11)
				end = " th";
			if  (day % 10 == 2 && day != 12)
				end = " nd";
			if  (day % 10 == 3 && day != 13)
				end = " rd";
			end += " Day In Year";
			return number + end;
		} else {
			return "Invalid date";
		}
	}

	public String addDate(int noOfDays) {
		
		if ( validDate() ) {
			if (noOfDays > 0) {
				do {
					if (noOfDays + day <= daysInMonth(month, year)) {
						day += noOfDays;
						noOfDays = 0;
					} else {
						noOfDays -= (daysInMonth(month, year) - day + 1);
						day = 1;
						month++;
						if (month > 12) {
							month = 1;
							year++;
						}
						
					}
				} while (noOfDays > 0);
			}
			
		} else {
			System.out.println("Invalid date");
		}
		return this.toString();
	}
	
	public String subtractDate(int noOfDays) {
		
		if ( validDate() ) {
			if (noOfDays > 0) {
				do {
					if ( day - noOfDays >= 1) {
						day -= noOfDays;
						noOfDays = 0;
					} else {
						noOfDays -= day;
						month --;
						if (month < 1) {
							month = 12;
							year--;
						}
						day = daysInMonth(month, year);
					}
				} while (noOfDays > 0);
				
			}
		} else {
			System.out.println("Invalid date");
		}
		return this.toString();
	}
	
	public String toShortData() {
		if ( validDate() )
			return this.toString().substring(0, 6) + String.valueOf(year % 100);
		else
			return "Invalid date";
	}
	
	public String toLongDate() {
		String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		if ( validDate() )
			return 	((day < 10) ? ("0" + day) : String.valueOf(day)) + " " +
					monthName[month - 1] + " " + String.valueOf(year % 100);
		else
			return "Invalid date";		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if ( validDate() )
			return	((day < 10) ? ("0" + day) : String.valueOf(day)) + "/" +
					((month < 10) ? ("0" + month) : String.valueOf(month)) + "/" +
					String.valueOf(year);
		else
			return "Invalid date";		
	}
}
