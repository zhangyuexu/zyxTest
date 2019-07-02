package com.zyx.String.demo;
/**
 * 查询大字符串中某个小字符串出现的个数
 * @author ASUS
 *
 */
public class StringDemo5 {
	public static void main(String[] args) {
		String s="hello java,ni hao java,java good,hello world";
		String keyWord="java";
		//System.out.println(findKeyWord(s, keyWord));
		System.out.println(findWord(s,keyWord));
	}
	public static int findKeyWord(String s,String keyWord){
		int count=0;
		while(true){
			//System.out.println(s);
			int index=s.indexOf(keyWord);
			if(index!=-1){
				count++;
				s=s.substring(index+keyWord.length());
			}
			else
				break;
			
		}
		return count;
	}
	
	public static int findWord(String s,String word){
		int count=0;
		int index=-1;
		
		while((index=s.indexOf(word))!=-1){
			System.out.println(s);
			count++;
			s=s.substring(index+word.length());

		}
		return count;
	}
}
