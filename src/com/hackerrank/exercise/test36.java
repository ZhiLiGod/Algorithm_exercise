package com.hackerrank.exercise;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class MyComparator implements Comparator<String> {
    public int compare(String x, String y) {
        if (x.length() == y.length()) {
            return x.compareTo(y);
        }
        
        return x.length() - y.length();
    }
}

public class test36 {
	public static void main(String[] args) {
        MyComparator m = new MyComparator();
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        Arrays.sort(unsorted, m);
        for(String s : unsorted){
        	System.out.println(s);
        }
    }
}
