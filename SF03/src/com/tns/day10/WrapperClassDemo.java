package com.tns.day10;

public class WrapperClassDemo {

	public static void main(String[] args) {
		//autoboxing =  automatic conversion of primitive datatype
		//unboxing = opposite operation of autoboxing
		
		//unboxing
		Integer i =new Integer(10);
		System.out.println(i); // print i
		int b = i.intValue(); //method to indicate b
		System.out.println(b);
		
		//without using intvalue()
		int c=i;
		System.out.println(c);
		
		//autoboxing
		int a=100; //assigning the value 100 to variable a
		Integer i1=a; // i1is name of wrapper class or variable for integers
		System.out.println(i1);
		
		
		
	}

}
