package pack1;

public class MethodDemo 
{
	
//	SYNTAX: Non-Static method
	
//	public void methodName()
//	{
//		// body or logic
//	}
	public void addNums()
	{
		System.out.println("addNums method");
		int add = 10 + 20;
		
		System.out.println(add);
		
//		subtractNums();
		
		non_Static1();
		
		MethodCallingClass mc = new MethodCallingClass();
		mc.non_Static2();
	}
	
	
	public void non_Static1()
	{
		System.out.println("non_Static1");
	}
	
//	SYNTAX: Static method
	
//	public static void methodName()
//	{
//		// body or logic
//	}
	
	public static void subtractNums()
	{
		System.out.println("subtractNums method");
		int add = 10 - 20;
		
		System.out.println(add);
		
		MethodDemo m1 = new MethodDemo();
		m1.addNums();
	}
	
	public static void main(String[] args) 
	{
		
//		Non-Static Method Calling
		
//		with the help object reference variable
		
		MethodDemo ref1 = new MethodDemo();
		ref1.addNums();
		
		
//		Static Method Calling
//		directly by method name
		
		subtractNums();
		
		
	}

}
