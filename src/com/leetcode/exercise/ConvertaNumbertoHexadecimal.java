package com.leetcode.exercise;

public class ConvertaNumbertoHexadecimal {
	public static void main(String[] args) {
		System.out.println(toHex(16));
		System.out.println(Integer.toHexString(16));
	}
	
	static char[] c = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	
	static public String toHex(int num) {
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
        	result = c[num & 15] + result;
        	num = (num >>> 4);
        }
        return result;
    }
}
