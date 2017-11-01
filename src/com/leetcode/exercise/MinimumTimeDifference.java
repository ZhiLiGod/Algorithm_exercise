package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimumTimeDifference {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("23:59");
		l.add("23:05");
		l.add("00:00");
		System.out.println(findMinDifference(l));
	}
	
	static public int findMinDifference(List<String> timePoints) {
        String[] str = new String[timePoints.size()];
        for(int i = 0 ; i < str.length ; i++){
        	str[i] = timePoints.get(i);
        }
        Comparator<String> comp = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				String s1 = o1.substring(0, 2);
				String s2 = o1.substring(3, 5);
				String s3 = o2.substring(0, 2);
				String s4 = o2.substring(3, 5);
				if(!s1.equals(s3)) return s1.compareTo(s3);
				else return s2.compareTo(s4);
			}
		};
		Arrays.sort(str, comp);
		for(String s : str) System.out.println(s);
		int min = Integer.MAX_VALUE;
		for(int i = 1 ; i < str.length ; i++){
			int res = 0;
			if(str[i].substring(0, 2) != str[i-1].substring(0,2)) res += 
					(Integer.parseInt(str[i].substring(0, 2)) - Integer.parseInt(str[i-1].substring(0,2))) * 60;
			res += (Integer.parseInt(str[i].substring(3, 5)) - Integer.parseInt(str[i-1].substring(3,5)));
			if(res < min) min = res;
		}
		int tmp = ((Integer.parseInt(str[0].substring(0, 2)) + 24) 
				- (Integer.parseInt(str[str.length-1].substring(0,2)))) * 60 + (Integer.parseInt(str[0].substring(3, 5)) - Integer.parseInt(str[str.length - 1].substring(3, 5))); 
		return min < tmp ? min : tmp;
    }
}
