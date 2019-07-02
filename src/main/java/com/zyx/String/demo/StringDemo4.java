package com.zyx.String.demo;
//将一个字符串中，第一个字母转换成大写，其他字母转换成小写
public class StringDemo4 {
	public static void main(String[] args) {
		System.out.println(function("LHoggh"));
		System.out.println(convert("holHOnlgIN080lmgmNN"));
	}
	//第一种写的太臃肿了
	public static String function(String s){
		String head=s.substring(0, 1);
		//System.out.println(head);
		//String end=s.substring(1,s.length());
		String end=s.substring(1);
		String headNew=head.toUpperCase();
		String endNew=end.toLowerCase();
		String sNew=headNew.concat(endNew);
		return sNew;
	}
	
	public static String convert(String s){
		String first=s.substring(0,1);
		String after=s.substring(1);
		first=first.toUpperCase();
		after=after.toLowerCase();
		return first+after;
	}
}
