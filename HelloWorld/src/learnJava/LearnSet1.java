package learnJava;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<String> obj = new TreeSet<String>();
		
		//1 Add Items in Set - Use Add()
		
		obj.add("Karim");
		obj.add("Rahim");
		obj.add("Rayhan");
		obj.add("Rumman");
		obj.add("Ehram");
		obj.add("Nasir");
		obj.add("Tipu");
		obj.add("Mamun");
		obj.add("adyan");
		obj.add("Ehsan");
		obj.add("Yusra");
		
		//2 Get count of Set -Use size()
		
		System.out.println(obj.size());
		
		System.out.println("-----------");
		
		//3 Print/Show/Display all Items in the Set - Use foreach
		
		for(String eachObj : obj) {
			System.out.println(eachObj);}
		
				
		for(String eachobj : obj) {System.out.println(eachobj);}
		
		System.out.println("---------------");
		
		//4 Get Particular Item from set - use contains() - Outcome True/False
		
		System.out.println(obj.contains("Hasan"));
		System.out.println(obj.contains("Rayhan"));
		
		System.out.println("----------");
		
		//5 Delete Item - Use remove(item)
		obj.remove("Ehram");
		
		//After Delete Item
		
		
		for(String eachobj : obj) {System.out.println(eachobj);}
		
		System.out.println("--------------");
		
		//After Delete item - obj.size()
		
		System.out.println(obj.size());
		
		System.out.println("---------");
		
		//6 Remove all Items from Set - Use obj.clear()
		
		obj.clear();
		
		//7 Confirm set is Empty or Not - Use obj.isEmpty() -Result True/False
		 System.out.println(obj.isEmpty());
		

	}

}
