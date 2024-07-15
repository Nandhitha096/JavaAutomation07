package ErrorsandExceptions;

import java.util.Scanner;

/* Q5: Write the code of ArryaIndexOutofBoundsException & StringIndexOutofBoundsException
 */

public class ProgramFive {
	
	int a[]= new int[10];
	String s = "Java Programming";
	
	
	//Method to execute ArrayIndexOutofBounds
	
	public void ArrayIndexOutofBounds()
	{
		
		
		int len= a.length;
		System.out.println("The size of array = " +len);
		
	    //when we try to insert value "100" out of assigned memory, throws exception
	    
	    try {
	    
	    	a[len+1]=100;
	    
	    }
	    
	    //Throws valid message to the user and the program continues
	    
	    catch(ArrayIndexOutOfBoundsException ae)
	    {
	    	//ae.printStackTrace();
	    	System.out.println("The value cannot be inserted since the it has reached the maximum length already");
	    }
	    	    
	}
	
	//Method to execute StringIndexOutofBounds
	
	public void StringIndexOutofBounds()
	{
		//trying to access the character which is invalid (string length is 15 where 20 is not possible to access)
		
		try {
			
			s.charAt(20);
	     }
		
		//throws valid message to the user and the program continues
		
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println("Invalid string accessed");
		}
	}

	public static void main(String[] args) {
		
		ProgramFive pf1 = new ProgramFive();
		
		//Two exceptions have been written in this program, so using switch case to execute the needed exception
		
		System.out.println("Which Exception has to be implemented ? \t 1.Array \t 2.String");
		Scanner sc= new Scanner(System.in);
		int inp = sc.nextInt();
		switch(inp)
		{
			
		case 1:
			pf1.ArrayIndexOutofBounds();	
			break;
			
		case 2:
			pf1.StringIndexOutofBounds();
			break;
			
		default :
			System.out.println(("Please enter valid input"));
		}
			

	}

}
