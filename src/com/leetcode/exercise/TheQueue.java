package com.leetcode.exercise;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("Hi");
		q.add("Hello");
		q.add("World");
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
	}
}
