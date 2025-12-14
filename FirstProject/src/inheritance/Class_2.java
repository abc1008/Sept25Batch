package inheritance;

public class Class_2 extends Class_1
{
	
	
	public Class_2()
	{
		super(5);
		System.out.println("Class_2 Constructor");
   
	}
	
	
	public void m1()
	{
		System.out.println("M1 child");
	}
	
	
	public static void main(String[] args) 
	{
		
		Class_2 ref = new Class_2();
		
		Class_1 conv = (Class_1)ref;
		
		
		conv.m1();
		
	}
	

}
