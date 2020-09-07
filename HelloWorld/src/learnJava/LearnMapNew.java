package learnJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMapNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//Result Order depends on Implementataion Classes
				
				Map<String, String> mp = new HashMap<String, String>();
				
				mp.put("Ehram", "Kulaura");
				mp.put("Adyan", "Sylhet");
				mp.put("Ehsan", "Noa");
				mp.put("Yusra", "Syt");
				mp.put("Kamal", "Fench");
				mp.put("Ehram", "Dhaka");
				mp.put("Rayhan", "Dhk");
				
				for(Entry<String, String> eachMp : mp.entrySet()) {
					System.out.println(eachMp.getKey() + "  " + eachMp.getValue());
					}
				
				//Get count of Map Entry -Size()
				
				System.out.println(mp.size());
				
				System.out.println("--------------");
				
				//Get()
				
				System.out.println(mp.get("Ehram"));
				
				//Remove() --Just Pass the Key
				
				//mp.remove("Ehram");
				
				System.out.println("-----------");
					
					
				//Get count of Map Entry -Size()
				
				System.out.println(mp.size());
						
				System.out.println("--------------");
				
				//ContainsKey() - Search by the Key (True/False)
				
				System.out.println(mp.containsKey("Nazat"));
				
				System.out.println("-------------");
				
				System.out.println(mp.containsKey("Ehram"));
				
				System.out.println("----------------");
				
				//ContainsValue (True/False)
				System.out.println(mp.containsValue(9990));
				
				System.out.println("-----------");
				
				System.out.println(mp.containsValue(234));
				
				System.out.println("-----------");
				
				//Removes all Map Data - clear();
				
				mp.clear();
				
				//isEmpty();
				
				System.out.println(mp.isEmpty());
				
				
			}

		}

	


