package com.leetcode.exercise;

public class AddBinary {
	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
	}
	
	static public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        int carry = 0;
        while(l1 >= 0 || l2 >=0){
        	int sum = carry;
        	if(l1 >= 0) sum += a.charAt(l1) - '0';
        	if(l2 >= 0) sum += b.charAt(l2) - '0';
        	sb.append(sum%2);
        	carry = sum / 2;
        	l1--;
        	l2--;
        }
        if(carry == 1) sb.append(1);
        return sb.reverse().toString();
    }
}
