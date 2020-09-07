package learnJava;

public class StringConcept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Way 1: String Literal
		String text = "We are Going to Sylhet";
		String text1 = "We are Going to Sylhet";
		
		//Way 2: Using String object to see the Referral code
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		
		//String Class Method:
		//1. Equals --->Return True/False
		System.out.println(text.equals(text1));//Compares the value True/False
		System.out.println(text==text1);//Compares memory address of String value,(close equal sign)
		
		//2. Length() Returns count of string
		text.length();
		String text2 = "We are Going to Sylhet";
		System.out.println(text2.length());// Returns 22, length of text2 value ie "We are Going to Sylhet"; ocupied area.
		
		//Concatenation/Concat - if we concat deferant data type variable, we use +, join to String value.
		
		String num = "20";
		String num1 = "35";
		int a = 10;
		int b = 25;
		
		//(num+a);
		//(a+b);
		//(num+num1);
		System.out.println(num+a);//String + Int, 2010, Return side by side.
		System.out.println(a+b);// Return 35, Add
		System.out.println(num + num1);// String + String, Returns 2035, side by side.
		
		//4 Trim() Want to remove white space from the both side of the String
		
		String Line ="            Ehram Chowdhury          ";
		System.out.println(Line);// Will show 'String' line both side white space
		System.out.println(Line.length());//Line and length()
		System.out.println(Line.trim());//Delete white space of the String
		System.out.println(Line.trim().length());//Trim the line (Delete extra white space)and show the length
		
		//5. Sub string(). Returns Partial String
		
		String text3 = "Ehram Chowdhury";
		System.out.println(text3.substring(6));//If put space num(ie 6)it will start the string from that space 
		System.out.println(text3.substring(0, 6));//To get a particular/specific part of string, --begining index and ending index, here Ehram will be printed
		System.out.println(text3.substring(6, 12));// this will print "Chowdh"
		
	}

}
