package pack1;

public class VariablesDemo 
{
	
//	STATIC VARIABLE
//	static dataType variableName = value;
	static int num = 10;
	static int num3;
	
//	NON-STATIC VARIABLE
//	dataType variableName = value;
	
	int num2 = 100;
	int num66 = 600;
	
	public void m1()
	{
//		dataType variableName = value;  - local variable
		int num5 = 200;
		int num6;
		int num = 900;
		int num2 = 700;
		
		num6 = 40;
		
		System.out.println(num5);
		System.out.println(num6);
		
		System.out.println(num);
		System.out.println(VariablesDemo.num);
		
		
		System.out.println(num2);
		
		
		
		
		
		System.out.println(this.num2); // non-static variable
		
		
		System.out.println(this.num66); // non-static variable
//		this keyword
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(num);
		System.out.println(num);
		
		
		
		VariablesDemo vd = new VariablesDemo();
		System.out.println(vd.num2);
		
		
		System.out.println(vd.num); // not recommended
		
		vd.m1();
		
	}
	
	
	

}
