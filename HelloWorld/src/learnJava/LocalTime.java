package learnJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		//System.out.println(ldt);
		//System.out.println(dd.equals(dd1));
		LocalDateTime myobj = LocalDateTime.now();
		DateTimeFormatter mmm = DateTimeFormatter.ofPattern("dd-MM-yyyy,hh-mm-ss");
		
		String ffff = myobj.format(mmm);
		System.out.println(ffff);
		
		

	}

}
