package inheritance;

//			 Child 			Parent
public class Class_B extends Class_A
{
	
	int num = 400;
	static int num2 = 1000;
	
	
	
	
	
	public static void m3()
	{
		
		int num = 99;
		System.out.println("m3 of Child");
		
		System.out.println(num);
	}
	
	public void m4()
	{
		System.out.println(super.num);
	}
	
	
	
	public static void main(String[] args) {
		
//		Class_A a1 = new Class_A();
//		a1.m1();
		
		
		Class_B b1 = new Class_B();
		b1.m1();
		
		
		m2();
		
		
		System.out.println(num2);
		System.out.println(b1.num);
		
//		parent class variables
		
		b1.m4();
		System.out.println(Class_A.num2);
	
	
	}
	

}
