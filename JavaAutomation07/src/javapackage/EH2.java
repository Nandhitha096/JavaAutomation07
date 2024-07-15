package javapackage;

public class EH2 {

	public static void main(String[] args) {
		int a[]=new int[10];
		try {
			a[10]=100;
		}catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.printStackTrace();
		}
		System.out.println("Exception done");

	}

}
