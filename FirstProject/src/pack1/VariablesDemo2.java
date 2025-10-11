package pack1;

public class VariablesDemo2 
{
	int num = 80;
	static int num2 = 70;

	public static void main(String[] args) 
	{
		VariablesDemo2 ref1 = new VariablesDemo2();
		System.out.println(ref1.num);
		
		ref1.num = 90; // re-initialization
		System.out.println(ref1.num);
		
		
		VariablesDemo2 ref2 = new VariablesDemo2();
		System.out.println(ref2.num);
		
		
		System.out.println("****** STATIC VARIABLE ********");
		
		System.out.println(ref1.num2);
		ref1.num2 = 60;
		System.out.println(ref1.num2);
		
		System.out.println(ref2.num2);
		
		
	}
	
	
	

}
