package com.hackerrank.exercise;
import java.util.Scanner;


public class test32 {
	static int minSteps(int n, String B){
        int count = 0;
        StringBuilder sb = new StringBuilder(B);
        for(int i = 0 ; i < sb.length() ; i++){
        	if(sb.substring(i, i+3).contains("010")){
        		count++;
        		i = i+2;	
        	}
        	if(sb.length() - 1 - i < 3){
        		break;
        	}
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
