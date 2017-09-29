package com.hackerrank.exercise;
import java.util.Scanner;


public class test13 {
	static String super_reduced_string(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 1 ; i < sb.length() ; i++){
        	if(sb.charAt(i)==sb.charAt(i-1)){
        		sb.delete(i-1, i+1);
        		i = 0;
        	}
        	System.out.println(i + " " + sb.length());
        }
        
        if(sb.length() == 0){
        	return "Empty String";
        }
        return sb.toString();
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
