package com.hackerrank.exercise;
import java.util.Scanner;


public class test8 {
	public static void main(String[] args) {
		newte();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[n][n];
		boolean ifP = false;
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ;j++){
				if(i+j == (n-1)){
					System.out.print("#");
					for(int k = j ; k < n - 1 ; k++){
						System.out.print("#");
					}
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	static void newte(){
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str="#";
        for (int i=0;i<n;i++)
            { 
            System.out.printf("%"+(n+2)+"s",str+"\n");
            str=str+"#";
        }
	}
}
