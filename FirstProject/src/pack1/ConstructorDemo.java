package pack1;

public class ConstructorDemo 
{
	int a = 10; 
	
	
	ConstructorDemo()
	{
		System.out.println("0 arg ConstructorDemo");
	}
	
	ConstructorDemo(int a)
	{
		this(2,5);   // call 0 arg constructor of same class
		System.out.println("1 arg ConstructorDemo"); 
		
	}
	
	ConstructorDemo(int a, int b)
	{
		System.out.println("2 arg ConstructorDemo");
	}
	
	ConstructorDemo(String a)
	{
		System.out.println("String arg ConstructorDemo");
	}

	
	public void m1()
	{
		System.out.println("Variable : " + this.a);
	}
	
	
	public static void main(String[] args) {
		
		
		ConstructorDemo var1 = new ConstructorDemo();
		
		ConstructorDemo var2 = new ConstructorDemo(5);
		
		ConstructorDemo var3 = new ConstructorDemo(6,7);
		
		ConstructorDemo var4 = new ConstructorDemo("222");
		
		
	}

}
