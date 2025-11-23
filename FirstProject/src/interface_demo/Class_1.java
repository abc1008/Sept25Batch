package interface_demo;

public class Class_1 implements Interface_1, Interface_2
{


	public void m1() {
		
		System.out.println("m1");
		
	}
	


	public void m2() {
		System.out.println("m2");
	}


	public void m3() {
		System.out.println("m3");
		
	}
	
	

	public void m5() {
		// TODO Auto-generated method stub
		
	}


	public void m6() {
		// TODO Auto-generated method stub
		
	}
	
	public void m10() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
	
	
	public static void main(String[] args) {
		
//		child ref + child obj
		Class_1 c1 = new Class_1();
		c1.m1();
		c1.m2();
		c1.m3();
		
		System.out.println();
		
//		parent ref + child obj
		Interface_1 c2 = new Class_1();
		c2.m1();
		c2.m2();
		c2.m3();
		
		Interface_1.m4();
		
		System.out.println(Interface_1.num);
		
	}



	public void m8()
	{
		System.out.println("m8");
	}



	
	
	
}
