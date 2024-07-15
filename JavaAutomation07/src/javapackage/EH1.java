package javapackage;

import java.util.*;
import java.util.InputMismatchException;


public class EH1 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the age :");
		
		
			try {
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Age is "+a);
			}catch(InputMismatchException ie) {
				ie.printStackTrace();
			}
			System.out.println("Exception done");
		}
		
	}

