package learnJava;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.Inflater;

public class Collection_ListArrayList {

	private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		List<Integer> lst = new ArrayList<Integer>();
		
		
		
		lst.add(234);
		lst.add(3455);
		lst.add(34355);
		lst.add(9234);
		lst.add(12345);
		lst.add(45637);
		
	
		
	lst.add(5, 999999);
	System.out.println(lst.contains(234));
	lst.add(0, 717123);
	System.out.println(lst.contains(0100023));
		
		
		for(Integer eachlst : lst) {
		
		System.out.println(eachlst);
		}
		
		//Way-6 Delete Item from the list Using remove()
		
		
		
		//System.out.println(ehr1.remove(3));
		
		
		
		//Way-8 Remove/Delete all of the Items from the List Using - clear()
		
		//ehr1.clear();
		
		//way-9 Confirm Empty - Use isEmpty()
		
		//System.out.println(ehr1.isEmpty());
		
		
		
	}

   }
