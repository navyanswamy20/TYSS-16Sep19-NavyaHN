package com.tyss.arrays;

public class TestB {
public static void main(String[] args) {
	int[] num =  {10,20,30};
	//System.out.println(num[10]);	//ArrayIndexOutOfBoundsException
	receive(num);
	int[] values = getArray();
	for(int val:values) {
		System.out.println(val);
		
		String[] names = {"a","b","c"};
		receive(names);
	}
}
static void receive(int[] numbers) {
	for(int num : numbers ) {
		System.out.println(num);
	}
}
static int[] getArray() {
	int[] values = {20,40,60,80,100};
	return values;
}
static void receive(String[] names) {
	for(String name : names ) {
		System.out.println(name);
	}
}

}

