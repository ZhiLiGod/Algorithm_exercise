package com.hackerrank.exercise;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class test41 {
	static int stringConstruction(String s) {
        
        Set<Character> set = new HashSet<>();
        char[] c = s.toCharArray();
        for(Character cc : c){
        	set.add(cc);
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
