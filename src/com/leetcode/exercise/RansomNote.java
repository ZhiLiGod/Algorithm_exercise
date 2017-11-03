package com.leetcode.exercise;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	public static void main(String[] args) {
		System.out.println(canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
	}
	
	static public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null || magazine == null) return false;
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        char[] c = magazine.toCharArray();
        for(int i = 0 ; i < c.length ; i++){
        	if(m.containsKey(c[i])) m.put(c[i], m.get(c[i])+1);
        	else m.put(c[i], 1);
        }
        for(int i = 0 ; i < ransomNote.length() ; i++){
        	if(!m.containsKey(ransomNote.charAt(i))) return false;
        	else if(m.get(ransomNote.charAt(i)) == 0) return false;
        	else m.put(ransomNote.charAt(i), m.get(ransomNote.charAt(i)) - 1);
        }
        return true;
    }
}
