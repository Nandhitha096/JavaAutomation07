package javaintroduction;

import java.util.Scanner;

public class TenthProgram {

	public static void main(String[] args) {
		
		long number = 0;
		String strnum;
		System.out.println("Enter an integer : ");
		Scanner sc=new Scanner (System.in);
		number=sc.nextLong();
		strnum=Long.toString(number);
		int len=strnum.length();
		System.out.println("The no of digits in the entered number is : " +len);		

	}

}
