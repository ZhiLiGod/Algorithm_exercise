package com.hackerrank.exercise;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class datetest {
	public static void main(String[] args) throws Exception {
		String datestr= "Mon Aug 15 11:24:39 CST 2016";//Date的默认格式显示
		Date date=new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK).parse(datestr);
		//格式化
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//Date d = sdf.parse(date.toString());
		
		String sDate=sdf.format(date);
		//Date dd = 
		//System.out.println(sDate);
		//System.out.println(dd);
	}
}
