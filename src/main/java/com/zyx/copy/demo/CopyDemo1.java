package com.zyx.copy.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  ������Դ c:\\a.txt
 *  ���Ƶ� d:\\a.txt  ����Ŀ��
 *  �ֽ�������,������Դ
 *  �ֽ������,������Ŀ��
 *  
 *  ����,��ȡ1���ֽ�
 *  ���,д1���ֽ�
 */
public class CopyDemo1 {
	public static void main(String[] args) {
		//�����������Ķ������
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			//�����������Ķ���,������Դ������Ŀ��
			fis = new FileInputStream("c:\\t.zip");
			fos = new FileOutputStream("d:\\t.zip");
			//�ֽ�������,��ȡ1���ֽ�,�����д1���ֽ�
			int len = 0 ;
			while((len = fis.read())!=-1){
				fos.write(len);
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
	}
}
