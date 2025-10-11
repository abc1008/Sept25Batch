package pack1;

public class Loops {

	
	public static void main(String[] args) {
		
		System.out.println("Git Check");
		

		
		
//		1
//		2
//		3
//		4
//		5
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		
		System.out.println();
		System.out.println("***** While Loop *****");
		System.out.println();
		
//		1.	While loop:
		
//		while(boolean condition)
//		{
//			code to repeat
//		}
		
		int num = 1;
		
		while(true)
		{
			if(num == 3)
			{
				num++;   // 2, 3
				continue;  // to skip current iteration and jump to next one
			}
			
			
			System.out.println(num);   // 1, 2 
			num++;   // 2, 3
			
			if(num == 5)
			{
				System.out.println(num);
				break;  // to break the loop and jump out of it
			}
			
		}
		
//		System.out.println("After while loop");
		
		
		
		System.out.println();
		System.out.println("***** Do While Loop *****");
		System.out.println();
		
		
//		do
//		{
//			code to repeat
//		}
//		while(boolean condition)
		
		
		int num2 = 1;
		
		do
		{
			System.out.println(num2);
			num2++;
		}
		while(num2 <= 5);
		
		
		System.out.println();
		System.out.println("***** For Loop *****");
		System.out.println();
		
		
//					1					2,5,8			4,7
//		for(variable_initialization; condition; increment/decrement)
//		{
//				3,6
//			code to repeat
//		}
		
		
		for(int num3 = 1; num3 <= 5; num3++)
		{
			if(num3 == 3)
			{
				break;
			}
			
			System.out.println(num3);
		}
		
		System.out.println("Out of for loop");
		
		
		System.out.println();
		System.out.println("***** Advanced For Loop *****");
		System.out.println();		
		

		int []  arr = {1,2,3,4,5};
		
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
//		for( CollectionType variable  : collectionName)
//		{
//			code to repeat
//		}
		
		for(int integer : arr)
		{
			System.out.println(integer);
		}
		
	}
	
	
}
