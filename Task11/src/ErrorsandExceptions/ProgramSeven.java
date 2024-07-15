package ErrorsandExceptions;

import java.util.Scanner;

/* Q7 : Create a custom exception in Java called "InvalidAgeException" that is thrown
 when the user enters the age less than 18. Implement exception handling in a Java program
 to catch the "InvalidAgeException" and display an error message.
 */

public class ProgramSeven {
	
	//defining a static datatype to store age
	
	static int age;
	
	//Method to check if age is less than 18 or not
	
	//Customizable exception (InvalidAgeException) has been created to check the requirements

	public static void AgeCheck(int age) throws InvalidAgeException
	{
		
		//check if age is less than 18 or not

			if(age<18)
			{
				throw new InvalidAgeException();
			}
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the age of the person : ");
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		
		//Handling Exception by using try and catch
		
		try {
			
			//calling the customizable exception method
			
		   AgeCheck(age);
		
		}
		catch(InvalidAgeException ie)
		{
			System.out.println("Invalid Age. Your age should be above 18 to access");
		}

		System.out.println("Welcome to the portal");
	}

}
