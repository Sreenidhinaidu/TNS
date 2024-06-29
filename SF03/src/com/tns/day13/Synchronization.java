package com.tns.day13;

//Synchronization is used for thread safe
//it allows only one thread at a time

class Counter{
	private int count;// 5
	
	public void increment() {
		count = count + 1;// t1 =5+1 = 6 / t2 =5+1 = 6
	}
	public int getCount() {
		return count;
	}
}
public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		Thread t1 = new Thread(() ->
		{
			for(int i=0; i<20;i++) {
				c.increment();
			}
		});
		Thread t2 = new Thread(() ->
		{
			for(int i=0; i<20;i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.getCount());
		

	}

}