package com.hackerrank.exercise;
import java.util.Arrays;
import java.util.Scanner;


public class test17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		solution(s, k);
		
	}
	static void solution(String s, int k){
		char[] c = s.toCharArray();
		k = k % 26;
		for(int i = 0 ; i < s.length() ; i++){
			if(c[i]>='A'&&c[i]<='Z'){
				if(c[i]+k <= 'Z'){
					c[i] += k;
				}else{
					int temp1 = c[i] + k - 91;
					System.out.println(temp1);
					c[i] = (char) ('A' + temp1);
				}
			}else if(c[i]>='a' && c[i]<='z'){
				if(c[i]+k <= 'z'){
					c[i] += k;
				}else{
					int temp2 = c[i] + k - 123;
					c[i] = (char) ('a' + temp2);
				}
			}
		}
		for(Character cc : c){
			System.out.print(cc);
		}
		
	}
}
