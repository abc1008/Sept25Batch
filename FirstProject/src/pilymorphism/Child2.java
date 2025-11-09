package pilymorphism;

public class Child2 extends Parent2
{
	
	int num2 = 20;


//	Overloaded 
	public int m3(String s)
	{
		System.out.println("m3 of child String arg");
		
		return 3;
	}

	
//	Overriding
	public static void m1()
	{
		System.out.println("m1 of child");
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		Parent2 p1 = new Child2();   // parent ref + Child obj
		p1.m1();
		

		
	}
	
	
	
}
