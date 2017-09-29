package com.hackerrank.exercise;
import java.util.Scanner;


public class test18 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        System.out.println(solution(S));
     
    }
	
	static int solution(String s){
		char[] c = {'S', 'O', 'S'};
		int k = s.length()/3;
		int count = 0;
		StringBuilder sb = new StringBuilder(s);
		while(k > 0){
			if(!sb.substring(0, 3).equals("SOS")){
				for(int i = 0 ; i < 3 ; i++){
					if(sb.charAt(i) != c[i]){
						//System.out.println("haha");
						count++;
					}
				}
				sb.delete(0, 3);
			}else{
				sb.delete(0, 3);
			}
			k--;
			
		}
//		System.out.println(s);
//		s.substring(3);
//		System.out.println(s);
		return count;
	}
}
