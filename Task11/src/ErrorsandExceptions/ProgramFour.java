package ErrorsandExceptions;

import java.util.Scanner;

/*Q4 : Write a java program that reads user input for two integers and performs division.
 Handle the exception that is thrown when the second number is zero and display
 an error message to the user 
 */

public class ProgramFour {
      
	static int a,b;
	
	//division method for dividing two integers
	
    public void division(int x, int y) throws Exception
    {
    	//checking the condition for exception
    	
    	if(y==0)
    	{
    		throw new ArithmeticException();
    	}
    	
    	//performing division operation 
    	else
    	{
    		float div=x/y;
    		System.out.println("The division of two integers : " +div);
    	}
    	
    }
    
	
	public static void main(String[] args) {
		
		ProgramFour pf = new ProgramFour();
		System.out.println("Enter the first interger : ");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the first interger : ");
		b=sc.nextInt();
		
		//implementing exception handling if the second entered value is zero
		
		try {
			
		pf.division(a, b);
		}
		catch(Exception e) {
		
		System.out.println("The value cannot be divided by zero, please enter a valid number");
			
		}
		
	}		

	}


