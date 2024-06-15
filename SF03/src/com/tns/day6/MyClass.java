package com.tns.day6;

//static can be executed at class loading time (it contains only static data that binds with class)
//non static bloack- a block execute when the object is created (instance variable)

public class MyClass {
    private int section; //non static  or instance variable
    private static int srNO; //static or class variable
    
    
    //static block
    
    static {
    	System.out.println("------------within static block----------");
    	srNO=1000;
    }
    
    
    // default constructor
    MyClass()
    {
    	System.out.println("--------------within default constructor------------");
    	srNO++;
    	section++;
    }
    
    @Override
    public String toString() {
    	return "MyClass [Serail NO "+srNO+", Section="+section+"]";
    }

               //static method
    static void display()
    {
    	  // System.out.println("Section: "+section);//cant access non static 
    	System.out.println("Seral NO."+srNO);
    }
	}

