package javapackage;

import java.util.*;

import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> obj= new HashMap<>();
		
		obj.put("CNG", 80);
		obj.put("Petrol", 110);
		obj.put("Diesel", 90);
		
		System.out.println(obj);
		
		for(Map.Entry<String, Integer> e : obj.entrySet())
		{
			System.out.print(e.getKey()+ " ");
			System.out.print(e.getValue()+ " ");
		}
		
	}

}
