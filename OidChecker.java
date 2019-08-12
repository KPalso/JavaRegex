package tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
public static void main(String args[]){
	
	ArrayList<String> check= new ArrayList<String>();
	//these first few should evaluate to true
	check.add("2.16.840.1.113883.10.20.22.1.2");
	check.add("2.16.840.1.113883.10.20.22.2.5");
	check.add("2.16.840.1.113883.10.20.22.4.3");
	check.add("2.167.840");
	check.add("2.16.9");
	check.add("1.1.3.4.4");
	check.add("2.16.840.1.114222.4.11.3591");
	check.add("2.16.840.1.113883.3.88.12.80.32");
	check.add("2.16.840.1.114222.4.11.837");
	//from here down are all bad ones and should evaluate to false
	check.add(".1.2.3.4.");
	check.add(".1.33.4");
	check.add("1..33.4");
	check.add("1.33..4");
	check.add("1..33..4");
	check.add("1...33.4");
	check.add("891.999.93.4.");
	check.add("1.2.3.4..");
	check.add("1.33.4.");
	check.add("891.999.93.4.");
	check.add("..891.999.93.4");
	check.add(".");
	check.add("...");
	check.add("......");
	check.add("..");
	check.add("333333");//check.get(i).matches("([0-9]+\\.)*[0-9]+" this one works for all except the ones that are only numbers
	check.add("345467");
	check.add("4456");
	check.add("1");
	check.add(" ");
	check.add("hi");
	check.add("%.");
	check.add("oh.my.god");
	check.add("goodness.me.");
	check.add("whoareyou?");
	check.add("goatscan'tspell");
for(int i=0;i<=34;i++){
	System.out.println("check.get("+i+") = " +  check.get(i) + " : " + check.get(i).matches("^((\\d+)\\.)+(\\d)+$"));
}
}
}
