package com.hackerrank.exercise;
import java.util.Scanner;


public class test20 {
	public static int numberNeeded(String first, String second) {
		int count = 0;
		int[] a = new int[26];
		for(Character c : first.toCharArray()){
			a[c-'a']++;
		}
		for(Character c : second.toCharArray()){
			a[c-'a']--;
		}
		for(Integer i : a){
			count += Math.abs(i);
		}
		
		return count;
		
	}
	  
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String a = in.next();
	    String b = in.next();
	    System.out.println(numberNeeded(a, b));
	}
}
