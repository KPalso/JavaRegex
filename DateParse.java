package tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Tester {
public static void main(String args[])  {
	
	ArrayList<String> check= new ArrayList<String>();
	check.add("01151984");
	check.add("12151984");
	check.add("09041944");
	check.add("10102012");
	check.add("10012012");
	check.add("*****************start falses*****************");
	check.add("100112");
	check.add("10112");
	check.add("011584");
	check.add("3/3/1459");
	check.add("3/3/59");
	check.add("03/03/1459");
	check.add("03/03/59");
for(int i=0;i<=12;i++){
	System.out.println(" ----- ");
	Date checkIt=null;
	try {
		checkIt = new SimpleDateFormat("MMDDYYYY").parse(check.get(i));
	} catch (ParseException e) {
		System.out.println("NOPE, can't parse date");
	}
	System.out.println("regex, check.get("+i+") = " +  check.get(i) + " : " + check.get(i).matches("^\\d{8}$"));
	if (checkIt!=null)
	System.out.println("parse date MMDDYYYY, check.get("+i+") = " +  check.get(i) + " : " + checkIt );
}
}
}

 
