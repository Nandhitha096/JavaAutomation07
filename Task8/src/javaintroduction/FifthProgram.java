package javaintroduction;

import java.util.Scanner;

public class FifthProgram {

	public static void main(String[] args) {
		
		System.out.println("Prime number or not program");
		System.out.println();
		
		System.out.println("Enter the number to be checked for prime number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int i=2;
		if(num<2)
		{
			System.out.println("Not a prime number");
		}
		else if(num>i && num%i == 0)
			{
				System.out.println("Not a prime number");
			}
			else
			{
				System.out.println("Prime number");
			}
		
		
	}

}
