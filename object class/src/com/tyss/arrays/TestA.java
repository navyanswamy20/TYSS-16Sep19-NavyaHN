package com.tyss.arrays;

public class TestA {
public static void main(String[] args) {
	int[] nums = new int[5];
	nums[0] =10;
	nums[1] =20;
	nums[2] =30;
	nums[3] =40;
	nums[4] =50;
	for(int i = 0;i<nums.length;i++) {
		System.out.println(nums[i]);
	}
	System.out.println("------------------------------------");
	int[] nums1 = {10,20,30,40,50};
	for(int j = 0;j<nums1.length;j++) {
		System.out.println(nums1[j]);
}
	System.out.println("---------------------for each---------------");
	for(int num:nums1) {
		System.out.println(num);
	}
	System.out.println("------------------------------------");
	 char[] ch = {'a','b','c'};
	for(int l = 0;l<ch.length;l++) {
		System.out.println(ch[l]);
}
	
	for(int c:ch) {
		System.out.println(c);
	}
	System.out.println("------------------------------------");
	double[] a1 = {2.3,5.9,4.9,1.3,0.2};
	for(int i = 0;i<a1.length;i++ ) {
		System.out.println(a1[i]);
	}
	
	for(double a:a1) {
		System.out.println(a);
	}
	System.out.println("------------------------------------");
	String[] names = {"navya","kali","lalu" ,"mona"};
}

}