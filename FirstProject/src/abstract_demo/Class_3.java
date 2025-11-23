package abstract_demo;

public class Class_3 extends Class_2{

	public void m5() {
		
		System.out.println("m5");
	}
	
	
	
	public static void main(String[] args) {
		
		Class_3 c3 = new Class_3();
		c3.m1();
		c3.m2();
		
//		Class_2 c1 = new Class_2();  
		
		System.out.println();
		
		
		Class_2 c2 = new Class_3();   // parent ref +  child obj
		
		c2.m1();
		c2.m4();
		c2.m5();
		
		
		System.out.println(num2);
		System.out.println(c2.num);
		
		
//		abstraction = hiding internal logic and provide just functionality
		
		
	}

}
