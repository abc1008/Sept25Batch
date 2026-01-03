package collecttions;

import java.util.ArrayList;

public class ListDemo
{

	public static void main(String[] args)
	{

//	SYNTAX: ArrayList

//																								optional
//  ArrayList<DataType> listName = new ArrayList<DataType>();

		ArrayList<Integer> list1 = new ArrayList<>();
		
//		1. Add
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(30);
		list1.add(40);
		
//		10,20,30,40,50
		
//		
		
		System.out.println(list1);
		
		for(Integer i : list1)
		{
			System.out.println(i);
		}
		
		
//	2. Search/Get
		
		Integer data = list1.get(2);
		System.out.println("data : "  + data);
		
		
//	3. remove
		
		Integer removedEle = list1.remove(3);
		
		System.out.println("removedEle : "+removedEle);
		System.out.println(list1);
		
		list1.add(500);
		list1.add(600);
		list1.add(700);
		
		System.out.println(list1);
		
		
//		update ele
		
		list1.set(3, 6000);
		System.out.println(list1);
		
		
//		size : total num of elements in collections
		
		System.out.println(list1.size());
		
		
// contains
		System.out.println(list1.contains(20));

	}

}
