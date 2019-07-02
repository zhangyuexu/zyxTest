package com.zyx.String.demo;

public class StringBufferTest {
	public static void main(String[] args) {
		//function();
		int[] arr={34,12,89,68};
		System.out.println(function2(arr));
	}
	/**
	 * StringBuffer类的方法
	 * StringBuffer append(各种类型 参数) 
	 * append这个方法返回值，源码是return this;即谁调用这个方法就返回谁
	 * StringBuffer delete(int start, int end) 移除此序列的子字符串中的字符。
	 * StringBuffer deleteCharAt(int index) 移除此序列指定位置的 char。
	 * StringBuffer insert(int index, 任意类型) 将任意类型的数据插入到缓冲区的指定索引上
	 * StringBuffer replace(int start, int end, String str) 使用给定 String 中的字符替换此序列的子字符串中的字符。 
	 * StringBuffer reverse() 将此字符序列用其反转形式取代。
	 * String substring(int start)  返回一个新的 String，它包含此字符序列当前所包含的字符子序列。
	 * String substring(int start, int end) 返回一个新的 String，它包含此序列当前所包含的字符子序列
	 * String toString() 返回一个新String,它的作用是将一个可变的字符串缓冲区对象变成一个不可变的字符串对象
	 */
	public static void function(){
		StringBuffer sb=new StringBuffer();
		sb.append(6).append(false).append('a').append(2.2);//此时是sb调用的append，所以返回的还是sb这个StringBuffer类对象
		System.out.println(sb);
		sb.delete(1, 5);
		//sb.delete(0, sb.length());//这是把缓冲区里面的字符全部给删掉了
		//System.out.println(sb);
		sb.replace(1, 5, "Q");
		System.out.println(sb);
		String s=sb.toString();//它的作用是将一个可变的字符串缓冲区对象变成一个不可变的字符串对象
		System.out.println(s);
		
	}
	
	/**
	 * 原始格式：int[] arr={34,12,89,68};将int[]中每个元素转成字符串
	 * 输出格式：[34,12,,89,68]
	 */
	public static String function2(int[] arr){
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				sb.append(arr[i]).append("]");
			}else{
				sb.append(arr[i]).append(",");
			}
		}
		String s=sb.toString();
		return s;
	}
}
