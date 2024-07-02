package com.tns.day15;

//Program to demonstrate a Queue

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	 public static void main(String[] args)
	    {
		 //implementation of queue
	        Queue<Integer> q = new LinkedList<>();
	 
	        // Adds 5 elements in queue{0, 1, 2, 3, 4} to
	        // the queue.add(10)
;	        for (int i = 0; i < 5; i++)
	            q.add(i);
	 
	        // Display contents of the queue.
	        System.out.println("Elements of queue "
	                           + q);
	 
	        // To remove the head of queue.
	        int removedele = q.remove(); // head as the element get removed
	        System.out.println("removed element-"
	                           + removedele);
	 
	        System.out.println(q);
	 
	        // To view the head of queue
	        int head = q.peek();  // retrieving the elements
	        System.out.println("head of queue-"
	                           + head);
	 
	        // Rest all methods of collection
	        // interface like size and contains
	        // can be used with this
	        // implementation.
	        int size = q.size();
	        System.out.println("Size of queue-"
	                           + size);
	    }

}
