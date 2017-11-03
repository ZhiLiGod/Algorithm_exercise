package com.leetcode.exercise;

public class ValidateIPAddress {
	public static void main(String[] args) {
		
	}
	
	static public String validIPAddress(String IP) {
		if(IP == null || IP.length() == 0) return "Neither";
		String[] str = null;
        if(IP.contains(".")) {
        	if(IP.charAt(IP.length()-1) == '.') return "Neither";
        	str = IP.split("\\.");
        	for(int i = 0 ; i < str.length ; i++){
        		for(int k = 0 ; k < str[i].length() ; k++){
        			if(!Character.isDigit(str[i].charAt(k))) return "Neither";
        		}
        		//System.out.println(Integer.parseInt(str[i]));
        		if(str[i].equals("")) return "Neither";
        		else if(Integer.parseInt(str[i]) > 255) return "Neither";
        		else if(str[i].startsWith("0")) return "Neither";
        		else if(str[i].length() != 4) return "Neither";
        		
        	}
        	return "IPv4";
        }
        else if(IP.contains(":")) {
        	if(IP.charAt(IP.length()-1) == ':') return "Neither";
        	str = IP.split(":");
        	for(int i = 0 ; i < str.length ; i++){
        		if(str[i].length() < 1 || str[i].length() > 4) return "Neither";
        		for(int k = 0 ; k < str[i].length() ; k++){
        			if( !Character.isLetterOrDigit(str[i].charAt(k))) return "Neither";
        			else if((str[i].charAt(k)>'F' && str[i].charAt(k) < 'a')
        					|| str[i].charAt(k)>'f') return "Neither";
        		}
        	}
        	return "IPv6";
        }
        return "Neither";
    }
}
