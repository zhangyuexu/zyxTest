package com.zyx.InputStream.demo;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *  FileInputStream��ȡ�ļ�
 *  
 *  ���췽��: Ϊ��������������Դ
 *  
 *    ����: 
 *      File ���Ͷ���
 *      String ����
 *   ��������ȡ�ļ��Ĳ���
 *     1. �����ֽ����������������
 *     2. ���ö�ȡ����read��ȡ
 *     3. �ر���Դ
 *     
 *     read()����,
 *       read()ִ��һ��,�ͻ��Զ���ȡ��һ���ֽ�
 *       ����ֵ,���ص��Ƕ�ȡ�����ֽ�, ��ȡ����β����-1
 */
public class FileInputStreamDemo1 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("c:\\a.txt");
		//��ȡһ���ֽ�,���÷���read ����int
		//ʹ��ѭ����ʽ,��ȡ�ļ�,  ѭ������������  read()��������-1
		int len = 0;//����read�����ķ���ֵ
	
		while( (len = fis.read()) != -1){//�����len��ʾ��ȡ�ĵ����Ķ�������
			System.out.print((char)len);
		}
    	//�ر���Դ
		fis.close();
	}
}

/*
 * int i = fis.read();
		System.out.println(i);
		
		i = fis.read();
		System.out.println(i);
		
		i = fis.read();
		System.out.println(i);
		
		i = fis.read();
		System.out.println(i);
 */