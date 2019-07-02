package com.zyx.String.demo;

public class RegexDemo {

	public static void main(String[] args) {
		checkQQ();
		checkTel();
		checkMail();
		//split_1();
		//split_2();
		replaceAll_1();

	}
	/**
	 * 检查QQ号是否合法：
	 * 0不能开头，全是数字，位数5-10位
	 * \\d表示0-9的数字，\\D匹配不是数字
	 */
	public static void checkQQ(){
		String QQ="123456";
		boolean b=QQ.matches("[1-9][0-9]{4,9}");//等价[1-9][\\d]{4,9}
		System.out.println(b);
	}
	/**
	 * 检查手机号是否合法：
	 * 第一位必须是1开头，第二位是34578中取，后面9位是0-9的数字
	 */
	public static void checkTel(){
		String telNum="13400865946";
		boolean b=telNum.matches("1[34578][\\d]{9}");
		System.out.println(b);
	}
	/**
	 * 检查邮箱是否合法：
	 * 12356@qq.com
	 * mym_ail@sina.com
	 * nihao@163.com
	 * wodemai@yahoo.com.cn
	 * 
	 * @前面，是数字、字母或下划线，且不少于1个
	 * @后面，是数字、字母
	 * .后面是字母
	 */
	public static void checkMail(){
		String telNum="134006my@163.com";
		boolean b=telNum.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
		System.out.println(b);
	}
	/**
	 * String类方法split对字符串进行切割
	 */
	public static void split_1(){
		String str="12-25-36-94";
		String[] arr=str.split("-");
		for(String s:arr){
			System.out.println(s);
		}
	}
	/**
	 * String类方法split对字符串进行切割
	 * 按照空格进行切割
	 */
	public static void split_2(){
		String str="hi   I am     java hello   world  !";
		String[] arr=str.split(" +");//x+代表x出现一次或者多次
		for(String s:arr){
			System.out.println(s);
		}
	}
	/**
	 * String类方法split对字符串进行切割
	 * 按照.进行切割
	 */
	public static void split_3(){
		String str="192.168.1.2";
		String[] arr=str.split("\\.");//在正则表达式里面.代表任意字符，所以不能直接按.来切割；转义字符两个算一个\\
		for(String s:arr){
			System.out.println(s);
		}
	}
	/**
	 * String类方法replaceAll(正则规则，替换后的新字符串)
	 * "Hello12345World6789012"将字符串里的所有字符替换掉
	 */
	public static void replaceAll_1(){
		String s="Hello12345World6789012";
		//s=s.replaceAll("[\\d]","#" );
		s=s.replaceAll("[\\d]+", "#");
		System.out.println(s);
	}
}
