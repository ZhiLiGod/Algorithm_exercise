package com.hackerrank.exercise;
import java.util.Scanner;


public class test27 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            solution(s);
        }
    }
	
	static void solution(String s){
		if(s.length() == 1){
			System.out.println("NO");
		}
		long l = 0;
		long firstX = -1;
		Boolean valid = false;
		for(int i = 1 ; i <= s.length()/2 ; i++){
			l = Long.parseLong(s.substring(0, i));
			firstX = l;
			String test = Long.toString(l);
			while(test.length() < s.length()){
				test += Long.toString(++l);
			}
			if(test.equals(s)){
				valid = true;
				break;
			}
		}
		System.out.println(valid ? "YES " + firstX : "NO");
	}
}
