package com.zyx.String.demo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringDemo1 {
	/**String类的父类也是Object
	 * 一切都是对象，字符串也是对象
	 * String类是描述字符串对象的类，所有的""都是String类的对象
	 * 字符串是一个常量，一旦创建，不能改变。字符串的本质是一个final的字符数组,private final char value[];
	 * 字符串定义方式有两个：直接=；使用String类的构造方法
	 * String类有很多重载的构造方法，用来构造字符串。
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		function();
	}
	public static void function() throws Exception{
		/**
		 * String类的构造方法String(byte[] bytes),传递一个字节数组来构造一个字符串
		 */
		byte[] bytes={97,98,99,100};
		String s=new String(bytes);
		System.out.println(s);
		/**
		 * String(byte[] bytes, int offset, int length) 
		 * 通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
		 * String(byte[] bytes, int offset, int length, Charset charset)
		 *  通过使用指定的 charset 解码指定的 byte 子数组，构造一个新的 String。
		 */
		byte[] bytes1={65,66,67,68,69};
		String s1=new String(bytes1,1,2,"UTF-8");
		System.out.println(s1);
		/**
		 * String(char[] value) 使用字符数组来构造一个字符串
		 * String(char[] value, int offset, int count) 
		 * 
		 */
		char[] value={'I','l','o','v','e'};
		String s2=new String(value);
		System.out.println(s2);
	}
}
