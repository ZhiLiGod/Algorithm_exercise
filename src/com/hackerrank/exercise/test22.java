package com.hackerrank.exercise;
import java.util.Scanner;


public class test22 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] n = new int[s];
        for(int a0 = 0; a0 < s; a0++){
            n[a0] = in.nextInt();
        }
        
        for(int i = 0 ; i < s ; i++){
        	System.out.println(solution(n[i]));
        }
        
    }
	
	static int solution(int n){
		if(n == 1){
			return 1;
		}else if(n == 2){
			return 2;
		}else if(n == 3){
			return 4;
		}else{
			return solution(n-1) + solution(n-2) + solution(n-3);
		}
	}
}
