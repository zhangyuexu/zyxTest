package com.zyx.OutputStream.demo;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   IO�����쳣����
 *   try catch finally
 *   
 *   ϸ��:
 *     1. ��֤���������,�������㹻
 *     2. catch����,��ô�����쳣
 *         ����쳣����Ϣ,Ŀ�Ŀ����������������
 *         ͣ�³���,���³���
 *     3. �����������ʧ����,��Ҫ�ر���Դ��
 *         new �����ʱ��,ʧ����,û��ռ��ϵͳ��Դ
 *         �ͷ���Դ��ʱ��,���������ж�null
 *         ��������null,�������ɹ�,��Ҫ�ر���Դ
 */
public class FileOutputStreamDemo3 {
	public static void main(String[] args) {
		//try ������������,try ���潨������
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("s:\\a.txt");
			fos.write(100);
		}catch(IOException ex){
			System.out.println(ex);
			throw new RuntimeException("�ļ�д��ʧ��,����");
		}finally{
			try{
				if(fos!=null)
			      fos.close();
			}catch(IOException ex){
				throw new RuntimeException("�ر���Դʧ��");
			}
		}
	}
}
