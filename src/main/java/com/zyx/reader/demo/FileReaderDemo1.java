package com.zyx.reader.demo;

import java.io.FileReader;
import java.io.IOException;

/*
 *  �ַ���������ȡ�ı��ļ�,�����ַ��������ĳ���
 *    java.io.Reader
 *  ר�Ŷ�ȡ�ı��ļ�
 *  
 *  ��ȡ�ķ��� : read()
 *   int read() ��ȡ1���ַ�����������Ҳ���ֽ�
 *   int read(char[] c) ��ȡ�ַ����飬��������Ҳ���ֽ�
 *   
 *   Reader���ǳ�����,�ҵ�������� FileReader
 *   
 *   ���췽��: ������Դ
 *     ����:
 *        File  ���Ͷ���
 *        String�ļ���
 */
public class FileReaderDemo1 {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("f:\\p_code.txt");
		/*int len = 0 ;
		while((len = fr.read())!=-1){
			System.out.print((char)len);
		}
		*/
		char[] ch = new char[1024];
		int len = 0 ;
		while((len = fr.read(ch))!=-1){
			System.out.print(new String(ch,0,len));
		}
		
		fr.close();
	}
}