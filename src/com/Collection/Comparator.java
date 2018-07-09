package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ComparatorSimple> list = new ArrayList<ComparatorSimple>();
		
		ComparatorSimple cs1 = new ComparatorSimple("shalini");
		ComparatorSimple cs2 = new ComparatorSimple("sandeep");
		ComparatorSimple cs3 = new ComparatorSimple("shalu");
		ComparatorSimple cs4 = new ComparatorSimple("aman");
		ComparatorSimple cs5 = new ComparatorSimple("amar");
		
		list.add(cs1);
		list.add(cs2);
		list.add(cs3);
		list.add(cs4);
		list.add(cs5);
		
		Collections.sort(list, new ComparatorLength());
		
		for(ComparatorSimple cs :list) {
			System.out.println(cs.name);
		}
		
		
		
		
	}

}
