package javaintroduction;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("Enter the value for First Integer (a) :");
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		System.out.println("Enter the value for First Integer (b) :");
		Scanner sc1= new Scanner(System.in);
		b= sc1.nextInt();
		System.out.println("Enter the value for First Integer (c) :");
		Scanner sc2= new Scanner(System.in);
		c= sc2.nextInt();
		System.out.println("Enter the value for First Integer (d) :");
		Scanner sc3= new Scanner(System.in);
		d= sc3.nextInt();		
		
		int sum1= a+b;
		int sum2= c+d;
		
		if(sum1>sum2)
		{
			System.out.println("Sum of 'a' and 'b' is greater than sum of 'c' and 'd' ");
		}
		else
		{
			System.out.println("Sum of 'c' and 'd' is greater than sum of 'a' and 'b' ");
		}
				

	}

}
