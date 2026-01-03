package collecttions;

import java.util.HashMap;
import java.util.Set;

public class MapDemo
{
	
	public static void main(String[] args)
	{
		
		
		
//	SYNTAX: HashMap

//																														optional
//HashMap<DataTypeKey,DataTypeValue> listName = new HashMap<DataTypeKey,DataTypeValue>();
		
		
		HashMap<Integer, String> empData = new HashMap<>();
		
		empData.put(101, "ABC");
		empData.put(102, "PQR");
		empData.put(103, "XYZ");
		empData.put(104, "TUV");
		empData.put(105, "QWE");
		empData.put(106, "ABC");
		empData.put(107, "PQR");
		empData.put(108, "XYZ");
		empData.put(109, "TUV");
		empData.put(110, "QWE");
		empData.put(106, "TYU");
		
		
		System.out.println(empData);
		
		
//		remove
		
		 String removedValue = empData.remove(107);
		 
		 System.out.println(removedValue);
		
			System.out.println(empData);
		
			
			
//			fetch
			
			 String data = empData.get(102);
			 System.out.println(data);
			 
//			 get all keys
			 
			 Set<Integer> allKeys = empData.keySet();
			 System.out.println(allKeys);
			 
			 
			 for(Integer key  : allKeys)
			 {
//				 System.out.println(empData.get(key));
				 System.out.println(empData.getOrDefault(key,"DefaultValue"));
			 }
			 
			 
			 
			 
//			
			 
		System.out.println(empData.containsKey(102));
		System.out.println(empData.containsValue("TUVe"));
		
		
		
	}

}
