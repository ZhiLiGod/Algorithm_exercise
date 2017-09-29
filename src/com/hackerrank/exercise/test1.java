package com.hackerrank.exercise;

public class test1 {
	public static void main(String[] args) {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaa0asdfS0Daaadddddd0D0D0dd";
		System.out.println(solution(s));
	}
	
	static public int solution(String S) {
        // write your code in Java SE 8
		int result = 0;
		
		int length = S.length();
		char[] c = S.toCharArray();
		int k = 0;
		for(int i = 0 ; i < length ; i++){
			if(S.charAt(i)>='0' && S.charAt(i)<='9'){
				S = S.replace(S.charAt(i), ' ');
			}
		}
		for(int i = 0 ; i < length ; i++){
			int index = S.indexOf(" ");
			if(index == -1){
				break;
			}
			for(int j = 0 ; j < index ; j++){
				if(S.charAt(j)>='A'&&S.charAt(j)<='Z'){
					if(result < index){
						result = index;
					}
				}
			}
			S = S.substring(index+1);
			if(S.indexOf(" ")<0){
				for(int x = 0 ; x < S.length() ; x++){
					if(S.charAt(x)>='A'&&S.charAt(x)<='Z'){
						if(result < index){
							result = index;
						}
					}
				}
			}
		}
		//System.out.println(S);
		
		return result;
    }
}
