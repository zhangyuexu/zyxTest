package com.zyx.File.Demo;

import java.io.File;

/*
 *  java.io.File
 *    ������ϵͳ�е�,�ļ�,Ŀ¼(�ļ���),·��,��װ��File����
 *    �ṩ����,����ϵͳ�е�����
 *    File����ϵͳ�޹ص���
 *    �ļ� file
 *    Ŀ¼ directory
 *    ·�� path
 */
public class FileDemo1 {
	public static void main(String[] args) {
		//File��ľ�̬��Ա����
		//1����ϵͳ�йص�·���ָ���
		String separator = File.pathSeparator;
		System.out.println(separator);// ��һ���ֺ�,Ŀ¼�ķָ�   ��Linux�е�Ŀ¼�ָ����� :
		
		//��ϵͳ�йص�Ĭ�����Ʒָ���
		separator = File.separator;
		System.out.println(separator);// ���� \  Ŀ¼���Ʒָ�  Linux / 
	}
}

