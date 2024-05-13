package javaintroduction;

import java.util.Scanner;

import java.lang.*;

public class NinthProgram {

	public static void main(String[] args) {
		
		int age=0;
		char gen;
		System.out.println("Enter the Gender of the person ( M / F ): ");
		Scanner sc1= new Scanner(System.in);
		gen = sc1.next().charAt(0);
		System.out.println("Enter the age of the person : ");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(gen=='M' || gen=='m')
		{
			if(age>=65)
		  {
			System.out.println("The person is a Senior Citizen");
		  }
		   else
		  {
			System.out.println("The person is NOT a Senior Citizen");
		  }
		}
		else if(gen=='F' || gen=='f')
		{
			if(age>=60)
			{
				System.out.println("The person is a Senior Citizen");
			}
		    else
		    {
			    System.out.println("The person is NOT a Senior Citizen");
		     }
		}
		else
		{
			System.out.println("Please enter valid input");
		}
	}
}


