package com.hackerrank.exercise;
import java.util.Scanner;


public class test39 {
	 public static void insertionSort(int[] A){
		 int count = 0;
	        for(int i = 1; i < A.length; i++){
	            if(A[i-1]>A[i]){
	            	int value = A[i];
		            int j = i ;
		            while(j > 0 && A[j-1] > value){
		                A[j] = A[j-1];
		                j = j - 1;
		                count++;
		            }
		            A[j] = value;
	            }
	        	
	        }
	        System.out.println(count);
	       // printArray(A);
	    }


	    static void printArray(int[] ar) {
	        for(int n: ar){
	            System.out.print(n+" ");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int i=0;i<n;i++){
	            ar[i]=in.nextInt();
	        }
	        insertionSort(ar);
	    }
}
