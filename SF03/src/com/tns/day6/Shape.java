package com.tns.day6;  //Abstract

//method only have declaration
// written in derived class(child,base)
//contains only one abstract class
//concrete class(have all implementations of all methods of all class)
//we cannot create object for abstract class

//abstract class
public abstract class Shape {
	protected float area;
	
	//abstract method
    abstract void calArea();   // no implementation, only declaration
    
    //concrete method
    void show()
    {
    	System.out.println("Area of shape is"+area);
    }

}
