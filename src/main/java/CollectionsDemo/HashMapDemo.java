package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo 
{

	HashMap<String, String> hm = new HashMap<String, String>() ;
	
	public void hashMapDemo() 
	{
		hm.put("Username", "Prabhat");
		hm.put("Password", "7710977abc");
		hm.put("RollNumber", "1001");
		hm.put("Pincode", "7708411");
		
		
		hm.put("School", "St.Augustine High School");
		System.out.println(hm);
		
		for (Map.Entry<String, String> obj : hm.entrySet())
		{
			System.out.println("Key :: " + obj.getKey() + " Value :: " + obj.getValue());
		} 
		
		
		
		
		
	}
	
	
	
	
	public void secondHashMap()
	{
		
	Map<String, Integer> map1 = new HashMap<>();
	map1.put("Roll Number", 10);
	map1.put("Marks", 50);
	map1.put("pincode", 400);
		
	for (Map.Entry<String, Integer> map : map1.entrySet())
	{
		System.out.println("Get key :: " +map.getKey() + " Get value ::  " + map.getValue() + " " );
		
		map.setValue(115);
		System.out.println(map);
		
	}
	
	}
	
	
	public static void main(String args[])
	{
		HashMapDemo hm = new HashMapDemo();
		
		//hm.hashMapDemo();
		
		hm.secondHashMap();
	}
	
	
}
