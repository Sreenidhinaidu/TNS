package com.tns.dayeight;

public class FunctionalinterfaceDemo {   
	

	public static void main(String[] args) {
		GreetInterface g=new GreetInterface();
		System.out.println(g.greet());
		
		//using lambda expression
		//short block of code
		//lambda takes in parameter and returns in value
		//they donot need any names they are similar to method , can be implemented directly in body of method
		//() parameter -> expression
		
		GreetClass g1 = () -> {                      //  " -> " =expression
			return "Good Afternoon";
		};
		System.out.println(g1.greet());		
	}

}
