package com.tns.day6;  //static variable

public class Employee {
        // decalre instance variable
	private String name;
	private int id;
	
	//declare static varibale company Name with data type string and assigned value
	static String companyName="TNS";
	
	//decalre a two parameter constructor with parameter named n and i
	Employee(String name,int id){
		this.name= name;
		this.id= id;
	}

	
	  @Override
	  public String toString() {
		  return "Employee [name =" +name+",id=" + id+",company=" +companyName+"]";
		  
	  }
}
