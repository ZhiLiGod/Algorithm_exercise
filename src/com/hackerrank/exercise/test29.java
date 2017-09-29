package com.hackerrank.exercise;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;


public class test29 {
	static int gemstones(String[] arr){
        int count = 0 ;
        Set<Character> set = new HashSet<Character>();
        Set<Character> set1 = new HashSet<Character>();
        set.add('a');
        set.add('b');
        set.add('c');
        set1.add('b');
        set1.add('n');
        set1.add('m');
        System.out.println(set);
        System.out.println(set1);
        System.out.println(set.retainAll(set1));
        System.out.println(set);
        //count = set.size();
        return count;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String[] arr = new String[n];
//        for(int arr_i = 0; arr_i < n; arr_i++){
//            arr[arr_i] = in.next();
//        }
    	System.out.println(UUID.randomUUID().toString().length());
    	String[] s = new String[2];
        int result = gemstones(s);
        System.out.println(result);
    }
}
