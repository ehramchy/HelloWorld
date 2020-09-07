package learnJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Result Order depends on Implementataion Classes
		
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		
		mp.put("Ehram", 123);
		mp.put("Adyan", 234);
		mp.put("Ehsan", 435);
		mp.put("Yusra", 566);
		mp.put("Kamal", 655);
		mp.put("Ehram", 676);
		mp.put("Rayhan", 6766);
		
		for(Entry<String, Integer> eachMp : mp.entrySet()) {
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
