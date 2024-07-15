package javapackage;

//import java.util.Scanner;

public class InheritanceDemo2 extends InheritanceDemo1 {
	int sum;
	
	public void add(int a, int b)
	{
		 sum = a+b;
		 System.out.println("Sum of two integers = "+sum);
	}

	public static void main(String[] args) {
		
		int x=100;
		int y=50;
		
		
		InheritanceDemo2 obj = new InheritanceDemo2();
		/*System.out.println("Enter the first number :");
		Scanner a1= new Scanner(System.in);
		System.out.println("Enter the second number :");
		Scanner b1= new Scanner(System.in);*/
		
		obj.division(x,y);
		obj.add(x,y);
		
		
}

}
