package com.hackerrank.exercise;
import java.util.Arrays;
import java.util.Scanner;


public class test24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(solution(s));
	}
	
	static String solution(String s){
		int[] a = new int[26];
		s = s.toLowerCase();
		String ss = null;
		for(Character c : s.toCharArray()){
			if(c>='a'&&c<='z'){
				a[c - 'a']++;
			}
			ss = Arrays.toString(a);
			if(!ss.contains("0")){
				return "pangram";
			}
		}
		return "not pangram";
	}
}
