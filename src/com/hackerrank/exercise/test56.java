package com.hackerrank.exercise;
import java.util.Scanner;


public class test56 {
	static String timeConversion(String s) {
        String time = s.substring(s.length()-2);
        int index = s.indexOf(time);
        StringBuilder sb = new StringBuilder();
        if(time.equals("AM")){
        	if(s.substring(0, 2).equals("12")){
        		sb.append("00");
        	}else{
        		sb.append(s.substring(0, 2));
        	}
        	return sb.append(s.substring(2, index)).toString();
        }else {
        	if(s.substring(0, 2).equals("12")){
        		sb.append("12");
        	}else{
        		sb.append(Integer.parseInt(s.substring(0, 2))+12);
        	}
        	return sb.append(s.substring(2, index)).toString();
        }
        
        
        //return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
