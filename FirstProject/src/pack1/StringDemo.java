package pack1;

public class StringDemo
{
	
	public static void main(String[] args)
	{
		
//		SYNTAX 1
		String s1 = "ABC";
		System.out.println(s1);
		
		String s3 = "ABC";
		
		s3.concat(" XYZ");  // abc xyz
		
		String newStr = s3 + " New String";
		System.out.println(newStr);
		
		System.out.println();
		
		
//		SYNTAX 2
		String s2 = new String("PQR");
		System.out.println(s2);
		
		String s4 = new String("PQR");
		
		
		String s6 = "ABC XYZ";
	}
	
	

}
