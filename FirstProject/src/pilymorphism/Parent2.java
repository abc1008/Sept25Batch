package pilymorphism;

public class Parent2 {
	
	int num = 10;

	
	public static void m1()
	{
		System.out.println("m1 of parent");
	}
	
	public int m3()
	{
		System.out.println("m3 of Parent");
		return 3;
	}
	
	public int m3(char b)
	{
		System.out.println("char arg - m3 of Parent");
		return 3;
	}
	
	
	

	
}
