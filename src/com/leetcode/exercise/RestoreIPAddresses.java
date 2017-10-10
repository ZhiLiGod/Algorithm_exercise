package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
	public static void main(String[] args) {
		System.out.println(restoreIpAddresses(""));
	}
	
	static public List<String> restoreIpAddresses(String s) {
        List<String> l = new ArrayList<String>();
        int len = s.length();
        if(len > 12) return l;
        for(int i = 1 ; i < len - 2 ; i++){
        	for(int j = i + 1 ; j < len - 1 ; j++){
        		for(int k = j + 1 ; k < len ; k++){
        			String s1 = s.substring(0, i);
        			String s2 = s.substring(i, j);
        			String s3 = s.substring(j, k);
        			String s4 = s.substring(k);
        			if(correct(s1, s2, s3, s4)){
        				String result = s1 + "." + s2 + "." + s3 + "." + s4;
            			l.add(result);
        			}
        			
        		}
        	}
        }
        return l;
    }
	
	static public boolean correct(String s1, String s2, String s3, String s4){
		if(s1.length()>3 || s2.length()>3 || s3.length()>3 || s4.length()>3){
			return false;
		}
		if(Integer.parseInt(s1)>255 || Integer.parseInt(s2)>255 ||
				Integer.parseInt(s3)>255 || Integer.parseInt(s4)>255){
			//|| Integer.parseInt(s1)==0 || Integer.parseInt(s2)==0
			//|| Integer.parseInt(s3)==0 || Integer.parseInt(s4)==0
			return false;
		}
		if((s1.startsWith("0")&&s1.length()>1) || (s2.startsWith("0")&&s2.length()>1) || 
				(s3.startsWith("0")&&s3.length()>1) || (s4.startsWith("0")&&s4.length()>1)){
			return false;
		}
		return true;
	}
	
	
}
