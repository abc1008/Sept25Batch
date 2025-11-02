package pack1;

public class MethodCategories {

	public static void addition(int num1, int num2) 
	{
		
		
		int ans = num1 + num2 + subtract(60,10);
		
		System.out.println(ans);

	}
	
	static int subtract(int num1, int num2)
	{
		
		int ans = num1 - num2;
	
		
		return ans;
		
	}
	
	public void name() 
	{
		System.out.println("eee");
	}

	public static void main(String[] args) 
	{
		
		addition(10,20);
		
		addition(30,50);
		
		
		int ans = subtract(100, 30);
		System.out.println(ans);
		
		
		

	}

}
