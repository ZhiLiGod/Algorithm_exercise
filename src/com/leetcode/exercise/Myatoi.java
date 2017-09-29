package com.leetcode.exercise;

import java.util.Scanner;

public class Myatoi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(myAtoi(s));
	}
	
	static public int myAtoi(String str) {
		if(str == null || str == ""){
			return 0;
		}
		for(int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i)<'0' || str.charAt(i) > '9'){
				return 0;
			}
		}
        long num = Long.parseLong(str);
        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE){
        	return 0;
        }else{
        	return (int)num;
        }
    }
}
