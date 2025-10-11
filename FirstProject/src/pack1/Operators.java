package pack1;

public class Operators {
	
	
	public static void main(String[] args) {
		
//		a.	Pre-Increment   (++)
		int x = 60;
		int y = ++x; // First value of x will be increased by 1 and then assigned to y
		
		System.out.println(y);
		
//		b.	Post-Increment   (++)
		int a = 70;
		int b = a++;  // First value of a will be assigned to b and then value of a increased by 1  
		
		System.out.println(b);
		System.out.println(a);
		
		
//		c.	Pre-Decrement   (--)
		int p = 80;
		int q = --p; // First value of p will be decreased by 1 and then assigned to q
		
		System.out.println(q);
		
//		b.	Post-Decrement   (--)
		int r = 90;
		int s = r--; // First value of a will be assigned to b and then value of a increased by 1  
		
		System.out.println(r);
		System.out.println(s);
		
		
		
	}

}
