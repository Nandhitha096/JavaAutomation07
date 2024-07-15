package javapackage;

public class MethodOverloadingDemo1 {
	
	 public static int multiply(int a, int b)
		{
			int c=a*b;
			return c;
		}
	 public static int multiply(int n, int m,int o)
	 {
		 int p=n*m*o;
		 return p;
	 }

	public static void main(String[] args) {
		
		MethodOverloadingDemo1 obj= new MethodOverloadingDemo1();
		double mul1=obj.multiply(20, 30);
		double mul2=obj.multiply(50, 60, 70);
		
		System.out.println("Multiplication of two integers : " +mul1);
		System.out.println("Multiplication of three integers : "+mul2);
		
	}

}
