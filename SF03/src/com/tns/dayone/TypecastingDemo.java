package com.tns.dayone;

public class TypecastingDemo {

	public static void main(String[] args) {
		
		//widening 
		
		 byte b=10;//1 byte
		 int i=b;//b stored in i (2 byte)
		 System.out.println(i);
		 //ex2
		 
		 float f=22.3f;
		 double d=f;
		 System.out.println(d);
		 
		 //narrowing/explicit
		 
		 float f2=34.56f;//4 byte
		 int r=(int)f2;//use of (int) gives explicit
		 System.out.println(r);
			

	}

}
