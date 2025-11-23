package abstract_demo;

public abstract class Class_1 
{
	int num= 10;
	static int num2 = 20;
	
	
	public Class_1()
	{
		System.out.println("Cons");
	}
	
	
	
	// abstract = vague unclear
	
	public abstract void m1();  // abstract, incomplete
	public abstract void m3();
	public abstract void m4();
	public abstract void m5();
	
	
	public void m2()    // concrete, complete 
	{
		System.out.println("m2");
	}
	
	public static void m7()
	{
		System.out.println("Static m7");
	}
	

}
