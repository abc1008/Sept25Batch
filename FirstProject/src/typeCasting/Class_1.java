package typeCasting;

public class Class_1 {
	
	
	public static void main(String[] args) {
		
//		Implicit
		
		byte b = 10;   // --> int
		
		int a = (int)b;
		System.out.println(a);
		
		
		
		
		
//		Explicit 
		
		int x = 130;   // --> byte
		
		byte convX  = (byte)x;   // -128 to +127
		
		System.out.println(convX);
		
		
//		byte x2 = 127; 
		
		
		
	}

}
