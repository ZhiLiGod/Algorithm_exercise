package com.hackerrank.exercise;

public class test61 {
	public static void main(String[] args) {
		System.out.println(reverse(1000000003));
	}
	
	static public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        if(sb.charAt(0) == '0'){
        	return 0;
        }
        int i = 0 ;
        sb.reverse();
        while(sb.charAt(i) == '0'){
        	sb.delete(i, i+1);
        }
        if(sb.charAt(sb.length()-1) == '-'){
        	sb.delete(sb.length()-1, sb.length());
        	return Long.parseLong(sb.toString()) > Integer.MAX_VALUE ? 0 : Integer.parseInt(sb.toString())*-1;
        }
        return Long.parseLong(sb.toString()) > Integer.MAX_VALUE ? 0 : Integer.parseInt(sb.toString());
    }
}
