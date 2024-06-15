package com.tns.dayeight;


//types-1. functional interface with lambda expressions
//      2.marker interface
 //     3.implement interface


//class and class =extends
//class and interface =Implements
//interface and interface =extends


//basic syntax for interface
//interface A{
//	void show(); //abstract method and default public
//	int xyz =10;  //final and static by default
//}
//class ABC implements A{
//	A obj =  new ABC(); //we cannot create object for interface
//}

public class GreetInterface implements GreetClass {

	@Override
	public String greet() {

	return "Welcome to the world of java";
	}

	}
