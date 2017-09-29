package com.hackerrank.exercise;
import java.util.Arrays;


public class test {
	public static void main(String[] args) {
		//System.out.println("haha");
		int[] A = {-1,3,5};
		System.out.println(solution(A));
	}
	
	static public int solution(int[] A) {
        // write your code in Java SE 8
		int result = 1;
		int count = 0;
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		for(int i = 1 ; i < A.length ; i++){
			if(A[i-1]>0){
				if(A[i] == A[i-1]){
					continue;
				}else if(A[i] != (A[i-1]+1)){
					result = A[i-1]+1;
					break;
				}else if(A[i] == (A[i-1]+1)){
					count++;
				}
			}
			
		}
		if(count == A.length-1){
			return A[A.length-1]+1;
		}
		
		return result;
    }
}	
