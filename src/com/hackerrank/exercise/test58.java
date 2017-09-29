package com.hackerrank.exercise;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class test58 {
	static int commonChild(String s1, String s2){
        Set<Character> set1 = new TreeSet<Character>();
        Set<Character> set2 = new TreeSet<Character>();
        for(int i = 0 ; i < s1.length() ; i++){
        	set1.add(s1.charAt(i));
        	set2.add(s2.charAt(i));
        }
        set1.retainAll(set2);
        //System.out.println(set1);
        return set1.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = commonChild(s1, s2);
        System.out.println(result);
    }
	
	
}
