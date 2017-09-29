package com.hackerrank.exercise;
import java.util.Scanner;


public class test33 {
	static public int solution(String[] g, int[] h, int first, int last, String s){
		int count = 0;
		for(int i = first ; i < last ; i++){
			for(int j = i+1 ; j <= last ; j++){
				if(g[i].equals(g[j])){
					if(h[i] < h[j]){
						g[i] = "#";
						h[j] += h[i];
					}else{
						g[j] = "#";
						h[i] += h[j];
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder(s);
		for(int i = first ; i <= last ; i++){
			if(sb.toString().contains(g[i])){
				count += h[i];
				int index = sb.indexOf(g[i]);
				sb.replace(index, index+1, "*");
				if(g[i].length()>1 || sb.toString().contains(g[i])){
					i--;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] genes = new String[n];
        for(int genes_i=0; genes_i < n; genes_i++){
            genes[genes_i] = in.next();
        }
        int[] health = new int[n];
        for(int health_i=0; health_i < n; health_i++){
            health[health_i] = in.nextInt();
        }
        int s = in.nextInt();
        int[] result = new int[s];
        for(int a0 = 0; a0 < s; a0++){
            int first = in.nextInt();
            int last = in.nextInt();
            String d = in.next();
            
            result[a0] = solution(genes, health, first, last, d);
        }
        int max = result[0];
        int min = result[0];
        for(int i = 1 ; i < s ; i++){
        	if(result[i] > max){
        		max = result[i];
        	}
        	if(result[i] < min){
        		min = result[i];
        	}
        }
        System.out.println(min + " " +max);
    }
}
