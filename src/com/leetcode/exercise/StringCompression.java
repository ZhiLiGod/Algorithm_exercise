package com.leetcode.exercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringCompression {
	public static void main(String[] args) {
		char[] c = {'a','a','b','b','c','c','c'};
		System.out.println(compress(c));
	}
	
	static public int compress(char[] chars) {
        Arrays.sort(chars);
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for(int i = 0 ; i < chars.length ; i++){
        	if(m.containsKey(chars[i])) m.put(chars[i], m.get(chars[i])+1);
        	else m.put(chars[i], 1);
        }
        int count = 0;
        for(Object i : m.values()){
        	if((int)i == 1) count++;
        	else count += String.valueOf(i).length()+1;
        }
         
        return count;
    }
}
