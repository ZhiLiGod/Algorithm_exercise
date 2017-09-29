package com.hackerrank.exercise;

public class test2 {
	public static void main(String[] args) {
		System.out.println(solution(12345, 678));
	}
	
	static public int solution(int A, int B) {
        // write your code in Java SE 8
		int result = -1;
		String s1 = "" + A;
		String s2 = "" + B;
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		int length2 = sb2.length();
		int j = 0;
		for(int i = 1 ; i < sb1.length() ; i++){
			if(j == length2){
				break;
			}
			sb1.insert(i, sb2.charAt(j));
			i++;
			j++;
		}
		if(j < sb2.length()){
			sb1.append(sb2.substring(j, sb2.length()));
		}
		result = Integer.parseInt(sb1.toString());
		
		if(result > 100000000){
			return -1;
		}
		return result;
    }
}
