package learnJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> obj = new HashSet<Integer>();
		//Set<Integer> obj = new LinkedHashSet<Integer>();
		//Set<Integer> obj = new TreeSet<Integer>();
		
		//1 Add Items in Set - Use Add()
		
		obj.add(123);
		obj.add(134);
		obj.add(345);
		obj.add(456);
		obj.add(34545);
		obj.add(4454);
		obj.add(56546);
		obj.add(67557);
		
		obj.add(4321);
		
		
		
		//2 Get count of Set -Use size()
		
		System.out.println(obj.size());
		
		System.out.println("-----------");
		
		//3 Print/Show/Display all Items in the Set - Use foreach
		
		/*for(Integer eachObj : obj) {
			System.out.println(eachObj);}*/
		
		for(Integer eachInt : obj) {
			System.out.println(eachInt);
		}
		
		//for(String eachobj : obj) {System.out.println(eachobj);}
		
		System.out.println("---------------");
		
		//4 Get Particular Item from set - use contains() - Outcome True/False
		
		System.out.println(obj.contains(9898898));
		System.out.println(obj.contains(123));
		
		System.out.println("----------");
		
		//5 Delete Item - Use remove(item)
		obj.remove(123);
		
		//After Delete Item
		
		for(Integer eachInt : obj) {System.out.println(eachInt);}
		//for(String eachobj : obj) {System.out.println(eachobj);}
		
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
