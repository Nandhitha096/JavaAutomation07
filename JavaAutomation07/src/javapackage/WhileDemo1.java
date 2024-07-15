package javapackage;

import java.util.Scanner; 

public class WhileDemo1 {

	public static void main(String[] args) {
		
		int n;
		int counter = 1;
		System.out.println("Enter the limit:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		while(counter<=n)
		{
			System.out.println(counter);
			counter++;
		}

	}

}
