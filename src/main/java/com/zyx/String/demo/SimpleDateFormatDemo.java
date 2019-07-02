package com.zyx.String.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws Exception {
		function1();
		function2();

	}
	//��������ת�ַ���:String format()
	public static void function1(){
		//SimpleDateFormat�ĸ�����Date��Date�ǳ�����,���ඨ������з���������SimpleDateFormat������ʹ��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");//ͨ�����췽���Լ������ʽ
		String s=sdf.format(new Date());//����String
		System.out.println(s);
	}
	//�����ַ���ת���ڶ���:Date parse()
	public static void function2() throws Exception{
		//SimpleDateFormat�ĸ�����Date��Date�ǳ�����,���ඨ������з���������SimpleDateFormat������ʹ��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy:MM:dd");//ͨ�����췽���Լ������ʽ
		Date date=sdf.parse("2017:10:30");//�û�һ��ͨ��ѡ��ؼ��ķ�ʽ�������
		System.out.println(date);
	}
}
