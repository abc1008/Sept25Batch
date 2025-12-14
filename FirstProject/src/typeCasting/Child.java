package typeCasting;

public class Child extends Parent
{
	public void m1()
	{
		System.out.println("M1 of Child");
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		Child c = new Child();
		
	
//		Parent convC = new Child();
		Parent convC = (Parent)c;
		convC.m1();
		
		
		Parent p = new Parent();
		
//		Child convP2 = new Parent();
		
		Child convP = (Child)p;
		convP.m1();
		
		
		
	}
}
