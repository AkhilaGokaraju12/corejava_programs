package com.Collections;

import java.util.Deque;
import java.util.LinkedList;

public class deque {

	public static void main(String[] args) {
		Deque<Integer> q=new LinkedList<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(20);
		q.offer(30);
	q.addFirst(45);
	q.addLast(8);

System.out.println(	q.peekFirst());
	}

}
