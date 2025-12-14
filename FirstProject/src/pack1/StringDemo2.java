package pack1;

public class StringDemo2
{
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		String s1 = "Testometer";
		
//	1.	Length : 
		
		int len = s1.length();
		System.out.println(len);
		
//	2. concat
		
		String s2 = s1.concat(" Training");
		System.out.println(s2);
		
		
//		3. charAt
		
		 char ch = s1.charAt(5);
		 System.out.println(ch);
		
//		4. equals
		 
		 boolean equals = s1.equals("testometer");  // testter
		 System.out.println(equals);
		 
		 
//		5. equalsIgnoreCase
		 boolean equalsIgnore = s1.equalsIgnoreCase("testometer");
		 System.out.println(equalsIgnore);
		 
		 
//		6. subString - Continuous part of any given string
		 
		 System.out.println(s1.substring(6));
		 System.out.println(s1.substring(4,8));
		 
//		 7. replace
		 
		 System.out.println(s1.replace("m", "Z"));
		 System.out.println(s1.replace("g", "Z"));
		 
		 
		 
//		 toUpperCase
		 
		 System.out.println(s1.toUpperCase());
		 System.out.println(s1.toLowerCase());
		 
//		 trim
		 
		 String s3 = "   Testo meter   ";
		 System.out.println(s3.trim());
		 
		 
//		 indexOf
		 
		 System.out.println(s1.indexOf("e"));
		 System.out.println(s1.lastIndexOf("e"));
		 
		 System.out.println(s1.lastIndexOf("g"));
		 
//		 Q. verify if 'e' occurs multiple times or not. 
		 
//		 contains
		 
		 System.out.println(s1.contains("Test"));
		 
//		 toCharArray
		 
		  char[] chArray = s1.toCharArray();
		  
		  
//		  split
		  String s5 = "data1,data2,data3";
		  
		   String [] sArray = s5.split(",");
		   
		   for(String s: sArray)
		   {
		  	 System.out.println(s);
		   }
		  
		  
		 
	}
	
	

}
