package com.leetcode.exercise;

public class PlusOne {
	public static void main(String[] args) {
		int[] digits = {9, 9, 9};
		int[] res = plusOne(digits);
		for(Integer i : res){
			System.out.print(i);
		}
	}
	
	static public int[] plusOne(int[] digits) {
        int add = 1;
        for(int i = digits.length - 1 ; i >= 0 ; i--){
        	if(digits[i] + add < 10){
        		digits[i] = digits[i] + add;
        		add = 0;
        		return digits;
        	}else{
        		digits[i] = (digits[i] + add) % 10;
        	}
        }
        int[] arr = null;
        if(add == 1){
        	arr = new int[digits.length+1];
        	arr[0] = 1;
        	for(int i = 1 ; i < digits.length ; i++){
        		arr[i] = digits[i - 1];
        	}
        }
        return arr;
    }
}
