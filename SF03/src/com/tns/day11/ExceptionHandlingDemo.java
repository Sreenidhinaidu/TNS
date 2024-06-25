package com.tns.day11;

public class ExceptionHandlingDemo {

		//using try and catch 
		
		public void Demo() // throws Exception
		{
			int a=5/1; //arithmetic operation
			System.out.println(a);	
		}
		public void Slave() {
			try {
				Demo();
			}catch(Exception e) {
				System.out.println("Exception----->"+e);	 //detailed meassage
				
			}
		}
		
		public static void main(String[] args)  {  // throws Exception
			ExceptionHandlingDemo obj =new ExceptionHandlingDemo();
			obj.Slave();
		}
		

	}

