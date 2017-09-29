package com.hackerrank.exercise;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class test42 {
	static String isValid(String s){
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        
		for(int i = 0 ; i < s.length() ; i++){
			if(!m.keySet().contains(s.charAt(i))){
				m.put(s.charAt(i), 1);
			}else {
				int newValue = m.get(s.charAt(i)) + 1;
				m.put(s.charAt(i), newValue);
			}
		}
		//System.out.println(m);
		int countmin=0;
		int countmax=0;
		
		int min = Collections.min(m.values());
		int max = Collections.max(m.values());
//		if(max - min > 1){
//			return "NO";
//		}
		Set<Character> set = m.keySet();
		for(Character c : set){
			if(m.get(c)==min){
				countmin++;
			}else if(m.get(c)==max){
				countmax++;
			}
		}
		//System.out.println(countmin+" "+countmax);
		if(max-min>1&&countmin!=1){
			return "NO";
		}else if(max-min==1&&countmax>1&&countmin>1){
			return "NO";
		}
		return "YES";
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
