package com.hackerrank.exercise;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class test16 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        System.out.println(solution(s));
    }
	
	static int solution(String s){
		Set<Character> set = new HashSet<Character>();
		for(int i = 0 ; i < s.length() ; i++){
			set.add(s.charAt(i));
		}
		int row = 0;
		if(set.size() <= 2){
			row = 1;
		}else{
			row = (set.size()-1) * (set.size() - 2);
		}
		
		
		char[][] c = new char[row][];
		for(int i = 0 ; i < set.size() - 1 ; i++){
			for(int j = i+1 ; j < set.size() ; j++){
				//c[i][1] = 
			}
		}
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0 ; i < sb.length() ; i++){
			
		}
		return 1;
	}
}
