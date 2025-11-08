package pilymorphism;

public class Class_21 {
	
	
//	method signature:  method name + arguments
	
	static void m1()
	{
		System.out.println("m1");
	}
	

	public static int m1(int a)
	{
		System.out.println("m1");
		
		return a;
	}
	
	private static void m1(String a)
	{
		System.out.println("m1");
	}
	
	public static void main(String[] args) {
		
		
		Class_21 c1 = new Class_21();
		c1.m1("shc");
		
		
	}

}
