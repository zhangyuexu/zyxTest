package com.zyx.copy.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  �ֽ��������ļ�
 *   �������黺�����Ч��
 *   �ֽ�����
 *   FileInputStream ��ȡ�ֽ�����
 *   FileOutputStream д�ֽ�����
 */
public class CopyDemo2 {
	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream("c:\\t.zip");
			fos = new FileOutputStream("d:\\t.zip");
			//�����ֽ�����,����
			byte[] bytes = new byte[1024*10];
			//��ȡ����,д������
			int len = 0 ; 
			while((len = fis.read(bytes))!=-1){
				fos.write(bytes, 0, len);
			}
		}catch(IOException ex){
			System.out.println(ex);
			throw new RuntimeException("�ļ�����ʧ��");
		}finally{
			try{
				if(fos!=null)
					fos.close();
			}catch(IOException ex){
				throw new RuntimeException("�ͷ���Դʧ��");
			}finally{
				try{
					if(fis!=null)
						fis.close();
				}catch(IOException ex){
					throw new RuntimeException("�ͷ���Դʧ��");
				}
			}
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}
}
