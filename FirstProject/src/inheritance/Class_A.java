package inheritance;

public class Class_A {
	
	
	int num = 10;
	static int num2 = 100;
	
	
	
	public void m1()
	{
		System.out.println("m1 of Class_A");
	}

	
	public static void m2()
	{
		System.out.println("m2 of Class_A");
	}
	
	public static void main(String[] args) {
		
		m2();
		
		
		Class_B.m3();
		
	}
	
	
}
