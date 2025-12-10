package com.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
Queue<Integer> q=new LinkedList<>();
q.add(10);
q.add(20);
q.add(30);
q.add(10);
System.out.println(q.add(19));
System.out.println(q.element());
System.out.println(q.remove());
System.out.println(q);

q.offer(10);
q.offer(20);
q.offer(30);
System.out.println(q.offer(340));
System.out.println(q);
System.out.println(q.poll());

System.out.println(q.peek());


	}

}
