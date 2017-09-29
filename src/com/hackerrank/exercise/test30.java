package com.hackerrank.exercise;
import java.util.Scanner;


public class test30 {
	static int alternatingCharacters(String s){
        int count = 0 ;
		for(int i = 1 ; i < s.length() ; i++){
        	if(s.charAt(i) == s.charAt(i-1)){
        		count++;
        	}
        }
		return count;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
