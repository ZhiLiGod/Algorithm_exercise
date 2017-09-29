package com.hackerrank.exercise;
import java.util.Scanner;


public class test37 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int goal = in.nextInt();
		in.nextInt();
		int counter = 0;
		while(in.hasNextInt()){
		    if(in.nextInt() == goal) {
		        System.out.println(counter);
		        break;
		    }
		    counter += 1;
		}
		}
}
