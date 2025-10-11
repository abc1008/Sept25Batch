package pack1;

public class ArrayDemo {
	
	static ArrayDemo ar;  // null   // variable declaration
	static String s1;
	static int num4;
	
	public static void main(String[] args) {
		
		int a = 10; // variable declaration + variable initialization
		int b = 20;
		int c = 30;
		
		
		
		
		System.out.println(ar);
		System.out.println(s1);
		System.out.println(num4);
		int num;  // variable declaration
		
		num = 10;  // 
		
		
		
		
//		ArrayLength = total num of ele to be stored
//		SYNTAX 1: DataType [] arrayName = new DataType[ArrayLength];
		
		

					int [] numArray = new int[5];
					numArray[0] = 100;
					numArray[1] = 200;
					numArray[2] = 300;
					numArray[3] = 400;
					numArray[4] = 500;
					
//					Insertion
//					Fetch/Search
//					Remove/Delete
					
					numArray[4] = 0;
					
					int data = numArray[2];
					System.out.println(data);
					System.out.println(numArray.length);
					
//					Max index of array = array length - 1
					
					
					
//	  	SYNTAX 2: DataType [] arrayName = {data1, data2, data3, .. };	
					
				String [] sArray = {"abc", "pqr", "qwe"};
					
				System.out.println(sArray[2]);
				
				System.out.println(sArray.length);
					
					
					
					
	}

}
