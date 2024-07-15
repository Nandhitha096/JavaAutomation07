package ErrorsandExceptions;

import java.util.Scanner;

/* Q6 : You are building a Login system for a website using Java. If the user enters
 an incorrect password, you want to display a message informing them of the error.
 How would you use exception handling to handle this situation?
 */


//The class extends Exception to inherit all the properties of exception in the below login method

public class ProgramSix extends Exception{
	
	//Defining a hard coded value as correct password
	
	public static String correct_pass = "abc123@password";
	
	//Method to check if the entered password matches with the correct password or not
	
	public void login(String pass) throws Exception
	{
		//checking with case sensitivity
		
		if(!pass.equals(correct_pass))
		{
			throw new Exception("You have entered incorrect password ");
		}
	}

	public static void main(String[] args) {
		
		
		 ProgramSix psx = new ProgramSix();
		 System.out.println("-------------------LOGIN--------------------");
		 System.out.println("\n");
		 System.out.println("Enter the username : ");
		 Scanner sc = new Scanner(System.in);
		 String uname = sc.nextLine();
		 System.out.println("\n");
		 System.out.println("Enter the password : ");
		 String pass = sc.nextLine();
		 
		 //Handling exception by calling the login method (where we checked for correct password)
		 
		 try
		 {
			 psx.login(pass);
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("Login failed, enter correct password");
		 }
		 
		 System.out.println("Login successful");
		 
	}

}
