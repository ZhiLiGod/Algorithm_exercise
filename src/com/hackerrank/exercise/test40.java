package com.hackerrank.exercise;
import java.util.Scanner;


public class test40 {
	static String twoStrings(String s1, String s2){
       // int length = s1.length() > s2.length()? s2.length():s1.length();
		for(int i = 97 ; i < 97+25 ; i++){
        	if( s1.indexOf(i)!=-1 && s2.indexOf(i)!=-1 ){
        		return "YES";
        	}
        }
		return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
