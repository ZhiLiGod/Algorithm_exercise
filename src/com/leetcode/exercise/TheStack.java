package com.leetcode.exercise;

import java.util.Arrays;

public class TheStack {
	private String[] stackArray;
	
	private int stackSize;
	
	private int topOfStack = -1;
	
	public TheStack(int size){
		stackSize = size;
		stackArray = new String[size];		
		Arrays.fill(stackArray, "-1");//set each element to -1
	}
	
	public void push(String input){
		if(topOfStack + 1 < stackSize){
			topOfStack++;
			stackArray[topOfStack] = input;
		}else
			System.out.println("Full");
		
		display();
		System.out.println();
		
	}
	
	public String pop(){
		if(topOfStack >= 0){
			
			stackArray[topOfStack] = "-1";
			display();
			return stackArray[topOfStack--];
		}else{
			display();
			System.out.println("Empty");
			return "-1";
		}
	}
	
	public String peek(){
		//display();
		return stackArray[topOfStack];
	}
	
	public void display() {
		// TODO Auto-generated method stub
		for(String s : stackArray){
			if(!s.equals("-1")){
				System.out.print(s + " ");
			}
			
		}
	}
	
	public static void main(String[] args) {
		TheStack stack = new TheStack(10);
		stack.push("10");
		stack.push("20");
		stack.push("30");
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
	}
}
