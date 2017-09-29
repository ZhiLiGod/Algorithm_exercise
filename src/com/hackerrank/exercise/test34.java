package com.hackerrank.exercise;
import java.util.Arrays;
import java.util.Scanner;


public class test34 {
	static int anagram(String s){
        int result = 0;
        if(s.length() % 2 != 0){
        	result = -1;
        	return result;
        }else{
        	String s1 = s.substring(0, s.length()/2);
        	String s2 = new StringBuilder(s).substring(s.length()/2, s.length());
        	for(int i = 0 ; i < s1.length() ; i++){
        		
        			if(!s2.contains(s1.substring(i, i+1))){
        				result++;
        			
        			}else{
        				int index = new StringBuilder(s2).indexOf(s1.substring(i, i+1));
        				s2 = new StringBuilder(s2).replace(index, index+1, "#").toString();
        			}
        	}
        	
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
