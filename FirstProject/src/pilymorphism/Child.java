package pilymorphism;

public class Child extends Parent
{
	
	int num2 = 20;


//	Overloaded 
	public int m3(String s)
	{
		System.out.println("m3 of child String arg");
		
		return 3;
	}

	
//	Overriding
	public void m1()
	{
		System.out.println("m1 of child");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Child c = new Child();    // Child Ref + Child Obj
		c.m1();  // Overriden - 
		c.m3("abc");  // overloaded - 
		
		System.out.println();
		
		Parent p = new Parent();   // parent ref + parent obj
		p.m1();  // Overriden - 
		p.m3();  // overloaded
		p.m3('f');
		
		
		System.out.println();
		
		Parent p1 = new Child();   // parent ref + Child obj
		p1.m1();  // Overridden - 
		p1.m3();  // overloaded 
		p1.m3('c');  // overloaded 
		
		
//		Child c1 = new Parent();   - not possible 
		
		System.out.println(p.num);
		
		System.out.println(c.num2);
		
		System.out.println(c.num);
		
		
	}
	
	
	
}
