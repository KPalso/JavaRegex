package tester;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import extract.ErrorLog;

public class Tester {
public static void main(String args[]){
	
	ArrayList<String> check= new ArrayList<String>();
	check.add("OP");
	check.add("ZZ");
	check.add("start falses");
	check.add("cB");
	check.add("bb");
	check.add(" AB");
	check.add("cB ");
	check.add("bbe");
	check.add("A3B");
	check.add("2951-2");
	check.add("ABc");

for(int i=0;i<=10;i++){
	System.out.println("check.get("+i+") = " +  check.get(i) + " : " + check.get(i).matches("^[A-Z]{2}$"));
}
}
}
