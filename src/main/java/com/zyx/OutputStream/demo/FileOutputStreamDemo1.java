package com.zyx.OutputStream.demo;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   FileOutputStream��OutputStream������(��ʵ����)
 *   д�������ļ�,ѧϰ���෽��,ʹ���������
 *   
 *   �����еĹ��췽��: ����:����������Ŀ��
 *   FileOutputStream(File file) ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
 *   FileOutputStream(File file, boolean append) ׷��д��
 *   FileOutputStream(String name) ����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ�����
 *   FileOutputStream(String name, boolean append) ׷��д
 *   
 *   �����write������
 *   write(int b)  ��ָ���ֽ�д����ļ������
 *   write(byte[] b) �� b.length ���ֽڴ�ָ�� byte ����д����ļ��������
 *   write(byte[] b, int off, int len) ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ������
 *   
 *   ������ʹ�ò���
 *     1. ����������Ķ���,������Ŀ��
 *     2. ����������ķ���writeд
 *     3. close�ͷ���Դ
 *     
 *    ������Ĺ��췽��,���Դ����ļ�,����ļ�����,ֱ�Ӹ���
 */
public class FileOutputStreamDemo1 {
	public static void main(String[] args)throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\a.txt");
		//������ķ���writeд����
		//д1���ֽ�
		fos.write(97);
		
		//д�ֽ�����
		byte[] bytes = {65,66,67,68};
		fos.write(bytes);
		
		//д�ֽ������һ����,��ʼ����,д����
		fos.write(bytes, 1, 2);
		
		//д���ֽ�����ļ�㷽ʽ
		//д�ַ���
		fos.write("hello".getBytes());

		//�ر���Դ
		fos.close();
		
	}
}