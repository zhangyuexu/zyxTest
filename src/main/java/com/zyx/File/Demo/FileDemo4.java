package com.zyx.File.Demo;

import java.io.File;

/*
 *  File��Ļ�ȡ����
 */
public class FileDemo4 {
	public static void main(String[] args) {
		function();
	}
	/*
	 * File��Ļ�ȡ����
	 * String getParent() ����String����
	 * File getParentFile()����File����
	 * ��ȡ��·��
	 */
	public static void function_3(){
		File file = new File("d:\\eclipse\\eclipse.exe");
		File parent = file.getParentFile();
		System.out.println(parent);
	}
	
	/*
	 * File���ȡ����
	 * String getAbsolutePath() ����String����
	 * File   getAbsoluteFile() ����File����
	 * ��ȡ����·��
	 * eclipse������,д����һ�����·��,����λ�ù��̸�Ŀ¼
	 */
	public static void function_2(){
		File file = new File("src");
		File absolute = file.getAbsoluteFile();
		System.out.println(absolute);
	}
	
	/*
	 * File���ȡ����
	 * long length()����·���б�ʾ���ļ����ֽ���,���ļ��Ĵ�С
	 */
	public static void function_1(){
		File file = new File("d:\\eclipse\\eclipse.exe");
		long length = file.length();
		System.out.println(length);
	}
	
	/*
	 *  File��Ļ�ȡ����
	 *  String getName() ��ȡ·���е���󲿷ֵ�����
	 *  ����·���б�ʾ���ļ������ļ�����
	 *  ��ȡ·���е���󲿷ֵ�����
	 */
	public static void function(){
		File file = new File("d:\\eclipse\\eclipse.exe");
		String name = file.getName();
		System.out.println(name);
		
		/*String path = file.getPath();
		System.out.println(path);*/
//		System.out.println(file);
	}
}

