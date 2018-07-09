package com.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("Amit");  
		pq.add("Vijay");  
		pq.add("Karan");  
		pq.add("Jai");  
		pq.add("Rahul"); 
		
		Iterator itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
