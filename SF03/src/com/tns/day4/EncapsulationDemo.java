package com.tns.day4;

public class EncapsulationDemo {

	public static void main(String[] args) 
	{
     Encapsulation obj=new Encapsulation();
     obj.setAge(21);
     obj.setName("Sreenidhi");
     obj.setSerialNum(90);
     
     System.out.println(obj.getAge());
     System.out.println(obj.getName());
     System.out.println(obj.getSerialNum());
     
	}

}