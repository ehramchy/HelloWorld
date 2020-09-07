package learnJava;

import java.util.ArrayList;
import java.util.List;

public class CollectionClass_ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ehr = new ArrayList<String>();
		
		//No-1 Add more Items in the List - use add()
		
		ehr.add("Kamran");
		ehr.add("Jafor");
		ehr.add("Kamal");
		ehr.add("Mamun");
		ehr.add("Rayhan");
		ehr.add("Shipan");
		
		System.out.println(ehr);
		
		//Way-2 Count of List - use size()
		
		/*System.out.println(ehr.size());
		
		//Way-3 Pick any Item from the List - use ehr.get()
		
		System.out.println(ehr.get(4));
		
		//Way-4 After adding Item - size the List
		
		ehr.add("123");
		
		System.out.println(ehr.size());
		
		
		//Way-7 verifying particular/specific Item in the List - Using contains()
		
				System.out.println(ehr.contains("Jamal"));
		
		//Way-5 Print all of the item from the List using --for loop method
		
		
		for(int i = 0; i <=ehr.size(); i++) {
		System.out.println(ehr.get(i));
		
		}*/
		
		//Way-6 Delete Item from the list Using remove()
		
	    /*ehr.remove(3);
		
		System.out.println(ehr.remove(4));*/
		
		//Way-8 Remove/Delete all of the Items from the List Using - clear()
		
		ehr.clear();
		
		//way-9 Confirm Empty - Use isEmpty()
		
		System.out.println(ehr.isEmpty());
					
		

	}

}
