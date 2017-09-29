package com.hackerrank.exercise;

public class test3 {
	public static void main(String[] args) {
//		int[] A = {60,80,40};
//		int[] B = {2,3,5};
		int[] c = {40, 40, 100, 80, 20};
		int[] d = {3, 3, 2, 2, 3};
		int m = 3;
		int x = 5;
		int y = 200;
//		int M=5;
//		int X=2;
//		int Y=200;
//		System.out.println(solution(A,B,M,X,Y));
		System.out.println(solution(c,d,m,x,y));
	}
	
	static public int solution(int[] A, int[] B, int M, int X, int Y) {
        //M floor X: people Y: weight
		int times = 1;
        int lengthA = A.length;
        int lengthB = B.length;
		int currWeight = A[0];
		int i = 1;
		while(currWeight<=Y&&i < lengthA){
			currWeight += A[i];
			
			if(currWeight>Y || i==X){
				for(int j = 1 ; j < i ; j++){
					if(B[j] != B[j-1]){
						times += 1;
					}
				}
				times += 2;
				currWeight = A[i];
			}
			else{
				times++;
			}
			//times++;
			i++;
		}
		//System.out.println(i);
        return times;
    }
}
