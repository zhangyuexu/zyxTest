package com.zyx.Integer.demo;
/**
 * Integer类中的其他方法：
 * 包括三个方法，和2个静态成员变量
 */
public class IntegerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Integer类中的2个静态成员变量
	 * MAX_VALUE
	 * MIN_VALUE
	 * 
	 * Integer类中其他3个静态方法，做进制的转换
	 * 十进制转成二进制  toBinaryString(int)
	 * 十进制转成八进制  toOctalString(int)
	 * 十进制转成十六进制  toHexString(int)
	 * 以上三个方法，返回值都是以String形式出现
	 */
	public static void function(){
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.toBinaryString(99));
		System.out.println(Integer.toOctalString(99));
		System.out.println(Integer.toHexString(99));
	}

}
