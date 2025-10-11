package pack1;

public class MethodCallingClass 
{
	
	
	
	
	public void non_Static2()
	{
		System.out.println("non_Static2");
	}
	

	public static void main(String[] args) 
	{
//		Non-Static Method Calling
//		with the help object reference variable
		
		MethodDemo ref1 = new MethodDemo();
		ref1.addNums();
		
		
//		ClassName.methodName();
		
		MethodDemo.subtractNums();
		
	}

}
