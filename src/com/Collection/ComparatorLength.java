package com.Collection;

import java.util.Comparator;

class ComparatorLength implements Comparator<ComparatorSimple> {


	public int compare(ComparatorSimple cs1, ComparatorSimple cs2) {
		// TODO Auto-generated method stub
		return cs1.name.length()-cs2.name.length();
	}

	
	
}
