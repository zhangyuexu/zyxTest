package com.zyx.String.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws Exception {
		function1();
		function2();

	}
	//这是日期转字符串:String format()
	public static void function1(){
		//SimpleDateFormat的父类是Date，Date是抽象类,父类定义的所有方法，子类SimpleDateFormat都可以使用
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");//通过构造方法自己定义格式
		String s=sdf.format(new Date());//返回String
		System.out.println(s);
	}
	//这是字符串转日期对象:Date parse()
	public static void function2() throws Exception{
		//SimpleDateFormat的父类是Date，Date是抽象类,父类定义的所有方法，子类SimpleDateFormat都可以使用
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy:MM:dd");//通过构造方法自己定义格式
		Date date=sdf.parse("2017:10:30");//用户一般通过选择控件的方式输入进来
		System.out.println(date);
	}
}
