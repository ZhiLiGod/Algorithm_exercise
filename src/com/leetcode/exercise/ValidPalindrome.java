package com.leetcode.exercise;

import java.awt.image.ReplicateScaleFilter;

public class ValidPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("\"Do nine men interpret?\" \"Nine men,\" I nod."));
	}
	
	static public boolean isPalindrome(String s) {

		s = s.replace(" ", "")
				.replace(",", "")
				.replace(".", "")
				.replace("-", "")
				.replace("?", "")
				.replace("\"","")
				.toLowerCase();	
		System.out.println(s);
        for(int i = 0, j = s.length()-1; i < j ; i++, j--){
        	if(!Character.isLetterOrDigit(s.charAt(i))) i++;
        	if(!Character.isLetterOrDigit(s.charAt(j))) j--;
        	if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
