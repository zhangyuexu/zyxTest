package com.zyx.String.demo;
//��һ���ַ����У���һ����ĸת���ɴ�д��������ĸת����Сд
public class StringDemo4 {
	public static void main(String[] args) {
		System.out.println(function("LHoggh"));
		System.out.println(convert("holHOnlgIN080lmgmNN"));
	}
	//��һ��д��̫ӷ����
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
