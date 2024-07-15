package javapackage;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack<Integer> num= new Stack<>();
		num.push(100);
		num.push(200);
		num.push(300);
		num.push(400);
		num.push(500);
		
		System.out.println(num);
		
		num.pop();
		System.out.println(num);
		
		num.pop();
		System.out.println(num);
		
		}

}
