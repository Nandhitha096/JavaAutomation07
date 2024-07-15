package javapackage;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int n,limit;
		System.out.println("Enter the multiplication table value : ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println("Enter the limit value : ");
		Scanner sc1= new Scanner(System.in);
		limit=sc1.nextInt();
				
		for(int i=1;i<=limit;i++)
		{
			int mul= n*i;
			System.out.println(n+"x"+i+" "+"="+mul);
		}

	}

}
