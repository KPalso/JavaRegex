package tester;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tester {
	public static void main(String[] args) throws Exception {
		

		ArrayList<String> check= new ArrayList<String>();
		//these first few should evaluate to true
		check.add("LOINC");
		check.add("SNOMED-CT");
		check.add("SNOMED");
		check.add("ICD-10-CM");
System.out.println("***************START FALSES******************");
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
	for(int i=0;i<=29;i++){
		System.out.println("check.get("+i+") = " +  check.get(i) + " : " + check.get(i).matches("^[A-Za-z/-/-10]{1,20}$"));
	}
	}
	}
