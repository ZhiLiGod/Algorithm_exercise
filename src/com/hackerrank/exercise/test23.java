package com.hackerrank.exercise;
import java.util.Scanner;


public class test23 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            //your code goes here
            System.out.println(solution(s));
        }
    }
	
	static String solution(String s){
		String str = "hackerrank";
		int k = 0;
		if(s.length()>=str.length()){
			for(int i = 0 ; i < s.length() ; i++){
				if(s.charAt(i) == str.charAt(k)&& k<=str.length()){
					k++;
				}
			}
		}
		
		if(k == str.length()){
			return "YES";
		}
		
		return "NO";
	}
}
