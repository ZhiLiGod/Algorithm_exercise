package com.leetcode.exercise;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	private static String M[] = {"","M","MM","MMM"};
	private static String C[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	private static String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	private static String I[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	
	public static void main(String[] args) {
		System.out.println(romanToInt("DCXXI"));
	}
	
	static public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
		int[] a = new int[s.length()];
		for(int i= 0 ; i < s.length() - 1 ; i++){
			if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))){
				result += map.get(s.charAt(i));
			}else{
				result -= map.get(s.charAt(i));
			}	
		}
		return result + map.get(s.charAt(s.length()-1));
    }
}
