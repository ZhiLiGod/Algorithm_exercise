package com.hackerrank.exercise;
import java.util.Scanner;


public class test25 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            // your code goes here
            System.out.println(solution(x, s));
        }
    }
	
	static String solution(int x, String s){
		int[] a = new int[26];
		for(Character c : s.toCharArray()){
			a[c - 'a']++;
		}
		for(int i = 0 ; i < 26 ; i++){
			while(a[i] > 0){
				if(x == a[i]*(i+1)){
					return "Yes";
				}
				a[i]--;
			}
		}
		return "No";
	}
}	
