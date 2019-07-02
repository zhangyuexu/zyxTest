package com.zyx.String.demo;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function();
	}
	public static void function(){
		/**
		 * String类的常用方法,经常翻API文档看
		 * char charAt(int index) 
		 * String concat(String str) 将指定字符串连接到此字符串的结尾。
		 * boolean contains(CharSequence s) 将此字符串与指定的 CharSequence 比较。
		 * boolean contentEquals(StringBuffer sb) 将此字符串与指定的 StringBuffer 比较。
		 * boolean startsWith(String prefix) 
		 * boolean startsWith(String prefix, int toffset)测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
		 * boolean endsWith(String suffix)
		 * boolean equals(Object anObject) 
		 * boolean equalsIgnoreCase(String anotherString) 将此 String 与另一个 String 比较，不考虑大小写。
		 * byte[] getBytes() 使用平台的默认字符集将此 String 编码为 byte 序列
		 * byte[] getBytes(Charset charset) 使用给定的 charset 将此 String 编码到 byte 序列
		 * int indexOf(int ch) 返回指定字符在此字符串中第一次出现处的索引
		 * int indexOf(String str) 返回指定子字符串在此字符串中第一次出现处的索引
		 * int lastIndexOf(int ch)
		 * int lastIndexOf(String str)
		 * boolean isEmpty() 
		 * int length() 
		 * boolean matches(String regex) 告知此字符串是否匹配给定的正则表达式。
		 * String replace(char oldChar, char newChar)
		 * String replace(CharSequence target, CharSequence replacement)
		 * String replaceAll(String regex, String replacement) 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
		 * String replaceFirst(String regex, String replacement) 使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
		 * String[] split(String regex) 
		 * String[] split(String regex, int limit) 
		 * String substring(int beginIndex) 返回一个新的字符串，它是此字符串的一个子字符串。
		 * String substring(int beginIndex, int endIndex) 
		 * char[] toCharArray() 将此字符串转换为一个新的字符数组
		 * String toLowerCase() 
		 * String toUpperCase()
		 * String toString() 返回此对象本身（它已经是一个字符串！）。
		 * String trim()返回字符串的副本，忽略前导空白和尾部空白。
		 * String valueOf(boolean b) 
		 * String valueOf(char c) 
		 * String valueOf(char[] data) 
		 * String valueOf(char[] data, int offset, int count) 
		 * String valueOf(int i) 
		 * String valueOf(Object obj) 
		 */
		//valueOf即类型转换
		int m=2;
		String s1=String.valueOf(m);
		System.out.println(s1);
		
		String s2=String.valueOf(true);
		System.out.println(s2);
		
		char[] ch={'I','l','o','v','e'};
		String s3=String.valueOf(ch);
		System.out.println(s3);
		
		Person p=new Person("啊啊",22);
		String s4=String.valueOf(p);
		System.out.println(s4);
	}

}
