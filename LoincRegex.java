package tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
public static void main(String args[]){
	
	ArrayList<String> check= new ArrayList<String>();
	check.add("2951-2");
	check.add("3094-0");
	check.add("2028-9");
	check.add("2075-0");
	check.add("789-8");
	check.add("786-4");
	check.add("785-6");
	check.add("17861-6");
	check.add("2339-0");
	check.add("4544-3");
	check.add("6690-2");
	check.add("1742-6");
	check.add("787-2");
	check.add("777-3");
	check.add("1920-8");
	check.add("1751-7");
	check.add("5804-0");
	check.add("11579-0");
	check.add("26511-6");
	check.add("3173-2");
	check.add("2601-3");
	check.add("5821-4");
	check.add("5797-6");
	check.add("4548-4");
	check.add("1968-7");
	check.add("2336-6");
	check.add("11555-0");
	check.add("47527-7");
	check.add("11557-6");
	check.add("11556-8");
	check.add("22636-5");
	check.add("5769-5");
	check.add("2157-6");
	check.add("9830-1");
	check.add("44-3");
	check.add("start falses");
	check.add("65498143");
	check.add("1");
	check.add("0404");
	check.add("1111");
	check.add("11");
	check.add("23");
	check.add("345");
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
	check.add("4444-");
	check.add("4444--3");
	check.add("-33-3");
	check.add("-333");
	check.add("-33-");
	
for(int i=0;i<=63;i++){
	System.out.println("check.get("+i+") = " +  check.get(i) + " : " + check.get(i).matches("^(\\d+)\\-\\d$"));
}
}
}
