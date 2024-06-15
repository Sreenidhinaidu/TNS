package com.tns.daythree;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.setAge(18);
		obj.setName("Sreenidhi");
		obj.setSerialNUM(101);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSerialNUM());

	}

}
