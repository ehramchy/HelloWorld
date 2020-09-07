package learnJava;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//import org.testng.annotations.Test;


public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	
	
	//@Test
	
	//public void anothertest() {
	
		String dd = "We are going to Dalas";
		String dd1 = "We are going to Dalas";
		int nn = 108;
		String line = "     London   ";
		System.out.println(System.identityHashCode(dd));
		System.out.println(System.identityHashCode(dd1));
		
		String dd2 = new String();
		{
			System.out.println("London is the greener city");
		}
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(dd.equals(dd1));
		LocalDateTime myobj = LocalDateTime.now();
		DateTimeFormatter mmm = DateTimeFormatter.ofPattern("dd-MM-yyyy,hh-mm-ss");
		
		String ffff = myobj.format(mmm);
		System.out.println(ffff);
		
		System.out.println(dd.length());
		System.out.println(dd.concat(dd1));
		System.out.println(dd1.length());
		System.out.println(dd +   nn);System.out.println();
		System.out.println(line);
		System.out.println(dd1.trim());
		System.out.println(dd.substring(1, 4));
		System.out.println(dd1.toLowerCase());
		System.out.println(dd1.toUpperCase());
		System.out.println(dd.indexOf("D"));
		System.out.println(dd.charAt(9));
		System.out.println(dd.startsWith("W"));
		System.out.println(dd.endsWith("K"));
		System.out.println(dd.startsWith("E"));
		System.out.println(dd.endsWith("M"));
		System.out.println(dd.contains("tess"));
		System.out.println(dd.contains("We"));
		
		

	}

	
}
