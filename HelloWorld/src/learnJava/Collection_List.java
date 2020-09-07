package learnJava;

import java.util.ArrayList;
import java.util.List;

public class Collection_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object of ArrayList
		
				List<String> names = new ArrayList<String>();
				
				//Add Items on the List - Use Add();
				
			    names.add("Ehram");
				names.add("Adyan");
				names.add("Ehsan");
				names.add("Yusra");
				names.add("fgdfd");
				names.add("Kamru");
				names.add("Zahid");
				names.add("Hasan");
				names.add("Farhan");
				names.add("Kghfjgh");
				names.add("Faruk");
				
				
				System.out.println(names);
				
				//Count of List - Use size()
				
				System.out.println(names.size());
				
				//Create an object of ArrayList
				
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
				
				System.out.println(ehr.size());
				
				//Way-3 Pick any Item from the List - use ehr.get()
				
				System.out.println(ehr.get(4));
				
				//Way-4 After adding Item - size the List
				
				ehr.add("123");
				
				System.out.println(ehr.size());
				
				
				//Way-7 verifying particular/specific Item in the List - Using contains()
				
						System.out.println(ehr.contains("Jamal"));
				
				//Way-5 Print all of the item from the List using --for loop method
				
				
				/*for(int i = 0; i <=ehr.size(); i++) {
				System.out.println(ehr.get(i));
				
				}
				List<Integer> lst = new ArrayList<Integer>();
							
				
				lst.add(234);
				lst.add(3455);
				lst.add(34355);
				lst.add(9234);
				lst.add(12345);
				lst.add(45637);
				
				for(Integer eachlst : lst) {System.out.println(eachlst);}*/
				
				
				
				
				//Way-6 Delete Item from the list Using remove()
				
				ehr.remove(3);
				
				System.out.println(ehr.remove(3));
				
				
				
				//Way-8 Remove/Delete all of the Items from the List Using - clear()
				
				ehr.clear();
				
				//way-9 Confirm Empty - Use isEmpty()
				
				System.out.println(ehr.isEmpty());
				
				

	}

	}
