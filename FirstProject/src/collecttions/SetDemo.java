package collecttions;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo
{

	
	
	public static void main(String[] args)
	{
		
		
//		SYNTAX: 
		
//																				optional
//HashSet<DataType> setName = new HashSet<DataType>();
		
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(400);
		set.add(200);
		
		System.out.println(set);
		
		
//		remove
		
		boolean isRemoved = set.remove(800);
		System.out.println(isRemoved);
		
		System.out.println(set);
		
//		
		
		for(Integer i : set)
		{
			System.out.println(i);
		}

//	
		
		set.contains(500);
		set.remove(500);
		set.add(6000);
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		
		Iterator<Integer> ite = set.iterator();
		
		
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
		
		
	}
}
