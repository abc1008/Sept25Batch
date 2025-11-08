package access_modifiers;

public class Class_11
{
	protected int num1 = 100;
	
	
	protected Class_11()
	{
		System.out.println("Class_11 Constructor");
	}
	
	
	
	
	
	protected void m1()  // default + child class
	{
		System.out.println("m1 of class11");
	}
	
	public static void main(String[] args) {
		
		 Class_11 ref2 = new Class_11();
		 ref2.m1();
		 
	}

}
