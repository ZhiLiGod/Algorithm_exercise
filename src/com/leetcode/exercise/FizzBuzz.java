package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}
	
	static public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<String>();
        String s1 = "Fizz";
        String s2 = "Buzz";
        int i = 1;
        while(i <= n){
        	if(i%3==0 && i%5==0) l.add(s1+s2);
        	else if(i%3 == 0) l.add(s1);
        	else if(i%5 == 0) l.add(s2);    	
        	else l.add(""+i);
        	i++;
        }
        return l;
    }
}
