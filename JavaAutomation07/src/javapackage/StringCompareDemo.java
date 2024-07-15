package javapackage;

import java.util.Scanner;

public class StringCompareDemo {

	public static void main(String[] args) {
		
		String s1;
		String s2;
		
		System.out.println("Enter the First String : ");
		Scanner sc1=new Scanner(System.in);
		s1=sc1.nextLine();
		System.out.println("Enter the Second String : ");
		//Scanner sc2=new Scanner(System.in);
		s2=sc1.nextLine();
		
		//System.out.println(sc1);
		//String compare operation
		
		if(s1.equals(s2))
		{
			System.out.println("The entered strings are same");
		}
		else
		{
			System.out.println("The entered strings are different");
		}
		
		
	}

}
