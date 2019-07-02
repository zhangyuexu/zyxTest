package com.zyx.Integer.demo;
/**
 * Integer封装基本类型int,可以提供大量的方法
 * 将字符串转成基本类型int
 */
public class IntegerDemo1 {

	public static void main(String[] args) {
		function1();

	}
	/**
	 * Integer类构造方法
	 * Integer(String s)
	 * 将数字格式的字符串，传递到Integer类的构造方法中
	 * 创建Integer对象，包装的是一个字符串
	 * 将构造方法中的字符串，转成基本数据类型，调用非静态方法int intValue() //之所以是非静态方法，是因为通过构造方法new对象了，对象只能调非静态方法
	 */
	public static void function1(){
		Integer in=new Integer("100");
		int i=in.intValue();
		System.out.println(i);
	}
	/**
	 * 字符串装成整型
	 * Integer类中的静态方法int parseInte(String s)
	 */
	public static void function2(){
		int i=Integer.parseInt("-13");
		System.out.println(i/2);
	}
	/**
	 * 整型转成字符串有两种方式：
	 * 1、字符串拼接：任何类型+"" 都会转成字符串
	 * 2、Integer类中的静态方法toString()，这个toString()不再是重写Object的toString方法的意思了，这个是重载
	 */
	public static void function3(){
		int i=5;
		//String s=i+"";
		String s=Integer.toString(i);
		System.out.println(s);
	}

}
