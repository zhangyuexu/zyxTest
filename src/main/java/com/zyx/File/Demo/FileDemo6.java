package com.zyx.File.Demo;

import java.io.File;

/*
 *  File���ȡ����
 *  list
 *  listFiles
 */
public class FileDemo6 {
	public static void main(String[] args) {
		function_2();
	}
	public static void function_2(){
		//��ȡϵͳ�е����и�Ŀ¼
		File[] fileArr = File.listRoots();//���ص�Ҳ��File��������
		for(File f : fileArr){
			System.out.println(f);
		}
	}
	
	/*
	 *  File��Ļ�ȡ����
	 *  File[] listFiles() ���ص���File��������
	 *  ��ȡ��,File���췽���з�װ��·���е��ļ����ļ����� (����һ��Ŀ¼)
	 *  ���ص���Ŀ¼�����ļ���ȫ·��
	 */
	public static void function_1(){
		File file = new File("d:\\eclipse");
		File[] fileArr = file.listFiles();
		for(File f : fileArr){
			System.out.println(f);
		}
	}
	
	/*
	 *  File��Ļ�ȡ����
	 *  String[] list()���ص����ַ�������
	 *  ��ȡ��,File���췽���з�װ��·���е��ļ����ļ����� (����һ��Ŀ¼)
	 *  ����ֻ������
	 */
	public static void function(){
		File file = new File("c:");
		String[] strArr = file.list();
		System.out.println(strArr.length);
		for(String str : strArr){
			System.out.println(str);
		}
	}
}