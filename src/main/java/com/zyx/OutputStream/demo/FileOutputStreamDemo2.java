package com.zyx.OutputStream.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  FileOutputStream �ļ�����д�ͻ�������
 *  ��д: FileOutputStream���췽��, �ĵڶ���������,����true
 *  ���ļ���,д�뻻��,���Ż���  \r\n
 *  \r\n ����д����һ�е�ĩβ, Ҳ����д����һ�еĿ�ͷ
 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args)throws IOException {
		File file = new File("c:\\b.txt");
		FileOutputStream fos = new FileOutputStream(file,true);
		fos.write("hello\r\n".getBytes());
		fos.write("world".getBytes());
		fos.close();
	}
}