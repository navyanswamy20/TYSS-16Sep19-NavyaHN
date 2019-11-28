package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(36);
		pq.add(58);
		pq.offer(52);
		System.out.println("before poll "+pq);
		System.out.println("---------------iterator----------------");
		Iterator<Integer> i = pq.iterator();
		while(i.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("after poll() "+pq );
	}
}
