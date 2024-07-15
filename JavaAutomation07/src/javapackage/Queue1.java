package javapackage;

import java.util.ArrayDeque;

public class Queue1 {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> num = new ArrayDeque<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println(num);
		
		num.remove();
		System.out.println(num);
		num.remove();
		System.out.println(num);
		
	}

}
