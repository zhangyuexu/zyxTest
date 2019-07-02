package com.zyx.InputStream.demo;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *  FileInputStream��ȡ�ļ�
 *   ��ȡ����  int read(byte[] b) ��ȡ�ֽ�����
 *   ��������: ���������, ���Ч��
 *   read���ص�int,��ʾʲô���� ��ȡ�����ٸ���Ч���ֽ���
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:\\a.txt");
		//�����ֽ�����
		byte[] b = new byte[1024];
		
		int len = 0 ;
		while( (len = fis.read(b)) !=-1){//�����len��ʾÿ�ζ�ȡ���ֽ�������ֽ����ĸ���
			System.out.print(new String(b,0,len));
		}
		fis.close();
	}
}
/*
 * 
		int len = fis.read(b);
		System.out.println(new String(b));//ab
		System.out.println(len);//2
		
		len = fis.read(b);
		System.out.println(new String(b));//cd
		System.out.println(len);//2
		
		len = fis.read(b);
		System.out.println(new String(b));//ed
		System.out.println(len);//1
		
		len = fis.read(b);
		System.out.println(new String(b));//ed
		System.out.println(len);//-1
		*/