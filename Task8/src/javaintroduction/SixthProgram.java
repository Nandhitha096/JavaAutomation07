package javaintroduction;

import java.util.Scanner;

public class SixthProgram {

	public static void main(String[] args) {
		
		int n;
		int fact=1;
		System.out.println("Enter the number to find whether Factorial or not");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			 fact=fact*i;
		}
		
		System.out.println("The Factorial of "+n+ " is "+ fact);
	}

}
