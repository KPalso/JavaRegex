package tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
public static void main(String args[]){
	
	ArrayList<String> check= new ArrayList<String>();
	check.add("65498143");
	check.add("1");
	check.add("0404");
	check.add("1111");
	check.add("11");
	check.add("23");
	check.add("345");
	check.add("start falses");
	check.add(" ");
	check.add("1235.");
	check.add(".123558.");
	check.add("0.3514");
	check.add(".555");
	check.add("*");
	check.add("&");
	check.add("^tt");
	check.add("ttt");
	check.add("7t9");
	check.add("t8g");
	check.add("08765hh");
	check.add("8764gdas806");
	check.add("87#64gdas806");
	check.add("95j0");
	check.add("");
for(int i=0;i<=23;i++){
	System.out.println("check.get("+i+") = " +  check.get(i) + " : " + check.get(i).matches("^\\d+$"));
}
}
}
