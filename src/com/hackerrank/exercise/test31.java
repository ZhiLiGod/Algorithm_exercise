package com.hackerrank.exercise;
import java.util.Scanner;


public class test31 {
	static int theLoveLetterMystery(String s){
	        int count = 0 ;
	        int i = 0 ; 
	        int j = s.length() - 1;
	        while(i < j){
	        	count += Math.abs(s.charAt(i) - s.charAt(j));
	        	i++;
	        	j--;
	        }
	        
	        return count;
	}
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int q = in.nextInt();
	    for(int a0 = 0; a0 < q; a0++){
	        String s = in.next();
	        int result = theLoveLetterMystery(s);
	        System.out.println(result);
	    }
	}
}
