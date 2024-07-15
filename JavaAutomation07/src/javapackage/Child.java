package javapackage;

public class Child extends Parent {
	
	public void ch()
	{
		System.out.println("Welcome to child class");
	}

	public static void main(String[] args) {
		
		Child ch1=new Child();
		ch1.par();
		ch1.ch();

	}

}
