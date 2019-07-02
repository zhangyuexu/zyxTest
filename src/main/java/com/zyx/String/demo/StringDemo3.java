package com.zyx.String.demo;
/**
 * 求字符串中大写字母、小写字母、数字的个数
 * @author ASUS
 *
 */
public class StringDemo3 {
	public static void main(String[] args) {
		getCount("haogLJjgljg99723680Nmljgm");
	}
	public static void getCount(String s){
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);//这里不用把字符串转成字符数组，因为字符串本身就是字符数组，所以具有数组的特性
			//码表大写字母是65-90 小写字母是97-122 数字是48-57
			if(c>=65&&c<=90){
				bigCount++;
			}
			if(c>=97&&c<=122){
				smallCount++;
			}
			if(c>=48&&c<=57){
				numberCount++;
			}
		}
		System.out.println("大写字母的个数："+bigCount);
		System.out.println("小写字母的个数："+smallCount);
		System.out.println("数字的个数："+numberCount);
	}
}
