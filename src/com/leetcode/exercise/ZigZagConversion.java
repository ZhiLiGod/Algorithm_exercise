package com.leetcode.exercise;

public class ZigZagConversion {
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3));
	}
	
	static public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        //initialize
        for(int i = 0 ; i < numRows ; i++){
        	sb[i] = new StringBuilder();
        }
        int j = 0;
        while(j < s.length()){
        	int k = j;
        	for(int i = 0; i < numRows && k < s.length()  ; i++){
        		sb[i].append(s.charAt(k));
        		k++;
        	}
        	for(int i = numRows - 2 ; i >= 1 && k < s.length() ; i--){
        		sb[i].append(s.charAt(k));
        		k++;
        	}
        	j = k;
        }
        
        for(int i = 1 ; i < numRows ; i++){
        	sb[0].append(sb[i]);
        }
        
        return sb[0].toString();
    }
}
