package com.tns.day6;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		//create the first object of the class and pass the two arguments with type
		//String and int
		
		System.out.println(Employee.companyName);
		Employee e=new Employee("sree",123);
		System.out.println(e);
		
		//similarly create the second object of the class and [pass the two arguments
		e=new Employee("nidhi",321);
		System.out.println(e);
		


	}

}
