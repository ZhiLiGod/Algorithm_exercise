package com.leetcode.exercise;

import java.util.Stack;

public class TheStack1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Hi");
		stack.push("Hello");
		stack.push("world");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		
	}
}
