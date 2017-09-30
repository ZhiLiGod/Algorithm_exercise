package com.leetcode.exercise;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(-2147447412));
	}
	
	static public boolean isPalindrome(int x) {
        if(x < 0 || x > Integer.MAX_VALUE){
        	return false;
        }
        String s1 = new StringBuilder().append(x).toString();
        String s2 = new StringBuilder().append(x).reverse().toString(); 
        return s1.equals(s2);
        
    }
}
