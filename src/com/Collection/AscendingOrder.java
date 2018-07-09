package com.Collection;

import java.util.Set;
import java.util.TreeSet;

 class Order implements Comparable<Order>{
	
	String name;
	
	public Order(String name) {
		
		this.name = name;
		
	}


	public int compareTo(Order o) {
		// TODO Auto-generated method stub
	
		if(name.length()>o.name.length()){  
	        return 1;  
	    }else if(name.length()<o.name.length()){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
		//return name.length()-o.name.length();
	
	}
}

public class AscendingOrder  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Order> set =  new TreeSet<Order>();
		
		Order o1 = new Order("Shalini");
		Order o2 = new Order("Shalu");
		Order o3 = new Order("Agam");
		Order o4 = new Order("Amar");
		Order o5 = new Order("Sandeep");
		
		set.add(o1);
		set.add(o2);
		set.add(o3);
		set.add(o4);
		set.add(o5);
		
        for(Order or  : set)
		{
			System.out.println(or.name);
		}
		
		
	}

}
