package com.zyx.File.Demo;

import java.io.File;

/*
 *  File����жϹ���
 */
public class FileDemo5 {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 *  File�жϹ���
	 *  boolean isDirectory()
	 *  �ж�File���췽���з�װ��·���ǲ����ļ���
	 *  ������ļ���,����true,�����ļ�����false
	 *  
	 *  boolean isFile()
	 *  �ж�File���췽���з�װ��·���ǲ����ļ�
	 */
	public static void function_1(){
		File file = new File("d:\\eclipse\\eclipse.exe");
		if(file.exists()){
			boolean b = file.isDirectory();
			System.out.println(b);
		}
	}
	
	/*
	 *  File�жϹ���
	 *  boolean exists()
	 *  �ж�File���췽���з�װ·���Ƿ����
	 *  ���ڷ���true,�����ڷ���false
	 */
	public static void function(){
		File file = new File("src");
		boolean b = file.exists();
		System.out.println(b);
	}
}
