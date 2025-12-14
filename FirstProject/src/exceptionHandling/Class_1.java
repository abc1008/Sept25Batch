package exceptionHandling;

public class Class_1
{

	public static void main(String[] args)
	{

		try
		{
			// risky code
			int a = 20;
			int b = 0;
			int ans = 0;
			ans = a / b;
			System.out.println(ans);
			System.out.println("After exception line");

//			Read from DB 

//			establish connection 
//			Read Data 
//			close connection
		}
		catch (ArithmeticException ex)
		{
			System.out.println("Exception Caught : " + ex.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception Caught : " + ex.getMessage());
		}
		catch (Exception ex)
		{
			System.out.println("Exception Caught : " + ex.getMessage());
		}
		finally
		{

//			Clean-up activities

			System.out.println("Finally Block");
//			close connection
		}

//		System.out.println("After try catch");

	}

}
