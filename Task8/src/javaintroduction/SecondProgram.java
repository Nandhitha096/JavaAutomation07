package javaintroduction;

import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		
		int var;
		System.out.println("Enter any number :");
		Scanner sc= new Scanner(System.in);
		var=sc.nextInt();
		
	    if(var%2 == 0)
	    {
	    	System.out.println("It is an Even number");
	    }
	    else
	    {
	    	System.out.println("It is a odd number");
	    }

	}

}
