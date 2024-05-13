package javaintroduction;

public class FourthProgram {

	public static void main(String[] args) {
		
		System.out.println("Swapping program");
		System.out.println();
		
		int a = 10;
		int b = 20;
		int c;
		
		System.out.println("Before Swapping :");
		System.out.println("A = " +a+ " "+"B = "+b);
		System.out.println();
		
		//swapping
		
		c=b;
		b=a;
		a=c;
		
		System.out.println("After Swapping :");
		System.out.println("A = " +a+ " "+"B = "+b);

	}

}
