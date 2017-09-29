package com.hackerrank.exercise;
import java.util.Scanner;




public class test35 {
	static int makingAnagrams(String s1, String s2){
		int count = 0;
        for(int i = 0 ; i < s1.length() ; i++){
        	int index = s2.indexOf(s1.charAt(i)+"");
        	if(index == -1){
        		count++;
        		s1 = s1.substring(0, i) + s1.substring(i+1);
        		i--;
        	}else{
        		s2 = s2.substring(0, index) + "#" + s2.substring(index+1);
        	}
        }
        if(count != 0){
        	count += s2.length() - s1.length();
        }
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
