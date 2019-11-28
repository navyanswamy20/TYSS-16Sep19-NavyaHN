package com.tyss.sorting.set;

import java.util.Comparator;

public class CustSortByName implements Comparator<Customer>{
@Override
public int compare(Customer o1, Customer o2) {
	String s1 = o1.name;
	String s2 = o2.name;
	return s1.compareTo(s2);
}
}
