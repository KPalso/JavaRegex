package tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Tester {
	public static void main(String args[]) {
		// ISO 8601
		/*
		 * from w3.org 
		 * 1994-11-05T08:15:30-05:00 corresponds to November 5,
		 * 		1994, 8:15:30 am, US Eastern Standard Time.
		 * 1994-11-05T13:15:30Z corresponds to the same instant.
		 */
		// Z is EST? can they submit -1:00 for Z?
		// it expects 24h time? is midnight 0 or 24?
		ArrayList<String> check = new ArrayList<String>();
		check.add("2016-12-15T05:00:00Z");// true
		check.add("1994-11-05T13:15:30Z");//true
		check.add("*****************start falses*****************");
		check.add("1994-11-05T08:15:30-05:00");//this is ISO 8601 but not what we want
		check.add("2008-09-15T15:53:00");// false
		check.add("2008-09-1515:53:00Z");// false
		check.add("09041944");
		check.add("10102012");
		check.add("10012012");
		check.add("1/29/2016 7:51:26 AM");
		check.add("10112");
		check.add("011584");
		check.add("3/3/1459");
		check.add("3/3/59");
		check.add("03/03/1459");
		check.add("03/03/59");
		for (int i = 0; i <= 15; i++) {
			System.out.println(" ----- ");
			System.out.println("regex, check.get(" + i + ") = " + check.get(i) + " : "
					+ check.get(i).matches("^(\\d{4})\\-(\\d{2})\\-(\\d{2}T\\d{2}):(\\d{2}):(\\d{2})Z$"));

			Date checkIt = null;
			try {
				checkIt = new SimpleDateFormat("YYYY-MM-DD'T'hh:mm:ss'Z'").parse(check.get(i));
			} catch (ParseException e) {
				System.out.println("NOPE, can't parse date");
			}
			if (checkIt != null)
				System.out.println("YES parsed date \"YYYY-MM-DD\'T\'hh:mm:ss\'Z\'\", check.get(" + i + ") = "
						+ check.get(i) + " : " + checkIt);
		}
	}
}
