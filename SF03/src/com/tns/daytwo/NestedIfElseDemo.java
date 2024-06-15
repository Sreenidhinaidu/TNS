package com.tns.daytwo;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		
		int a=10, b=20, c=5;
		System.out.println("The largest number is ");
		if(a>b)//10>20=false
		{
			if(a>c)
			System.out.println(a);
			else
			System.out.println(c);
		}
		else
		{
			if(c>b)//5>20=false
			System.out.println(c);
			else
			System.out.println(b);
		}//op=20
	}

}
