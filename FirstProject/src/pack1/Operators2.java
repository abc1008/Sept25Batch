package pack1;

public class Operators2 {

	public static void main(String[] args) {

		int a = 90;

		boolean result = a <= 90;
		System.out.println(result);

		int b = 900;
		boolean result2 = (a == b);
		System.out.println(result2);

		boolean combinedResult = result && result2 && (100 > 101);
		System.out.println(combinedResult);

		boolean combinedResult2 = result || result2 && (100 > 101);
		System.out.println(combinedResult2);

		int div = 10 / 3;

		System.out.println(div);

		int rem = 10 % 3;
		System.out.println(rem);

		int rem2 = (12 % 2);

		boolean isEven = (rem2 == 0);

		System.out.println(isEven);

	}

}
