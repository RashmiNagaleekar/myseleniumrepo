package suitea;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Temp {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println(d.toString());
		
		String date_Selected = "12-04-2018"; // dd-MM-YYY
		
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		Date dateToSelect = sd.parse(date_Selected);
		System.out.println(dateToSelect.toString());

		
		//compare
		System.out.println(d.compareTo(dateToSelect));
		int compareDate = d.compareTo(dateToSelect);
		if(compareDate == 1) {
			System.out.println("Date is greater");
		}
		else if(compareDate == -1) {
			System.out.println("Date is lesser");
		}
		else {
			System.out.println("Dates are same");
		}
		String day = new SimpleDateFormat("dd").format(dateToSelect);
		System.out.println(day);
		String month =  new SimpleDateFormat("MM").format(dateToSelect);
		System.out.println(month);
		month =  new SimpleDateFormat("MMM").format(dateToSelect);
		System.out.println("3 letters of month: "+month);
		month =  new SimpleDateFormat("MMMM").format(dateToSelect);
		System.out.println("Full month name: "+month);
		String year =  new SimpleDateFormat("yyyy").format(dateToSelect);
		System.out.println(year);
	}
		

}
