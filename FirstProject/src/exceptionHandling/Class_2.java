package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_2 {
	
	
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException
	{
		
		
//
//		FileInputStream file = new FileInputStream("D:\\TRAININGS\\TRAININGS\\NEW BATCH\\Excel File.xlsx");
//		System.out.println("After FileInputStream");
//		
//		
//		Thread.sleep(5000);  // stop the program execution for given time
//		
//		System.out.println("After FileInputStream");
		
		
		
		
		int a = 10;
		int b = 12;
		
		if(a > b)
		{
			throw new ArithmeticException("A value is greater than B");
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("B value is greater than A");
		}
		
		
		
	}
	

}
