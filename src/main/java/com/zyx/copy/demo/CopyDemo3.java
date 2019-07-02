package com.zyx.copy.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  �ַ��������ı��ļ�,�����ı��ļ�
 *  �ַ�����ѯ����Ĭ�ϵı����,��������GBK
 *  FileReader��ȡ����Դ
 *  FileWriterд�뵽����Ŀ��
 */
public class CopyDemo3 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try{
			fr = new FileReader("c:\\1.txt");
			fw = new FileWriter("d:\\1.txt");
			char[] cbuf = new char[1024];
			int len = 0 ;
			while(( len = fr.read(cbuf))!=-1){
				fw.write(cbuf, 0, len);
				fw.flush();
			}
			
		}catch(IOException ex){
			System.out.println(ex);
			throw new RuntimeException("����ʧ��");
		}finally{
			try{
				if(fw!=null)
					fw.close();
			}catch(IOException ex){
				throw new RuntimeException("�ͷ���Դʧ��");
			}finally{
				try{
					if(fr!=null)
						fr.close();
				}catch(IOException ex){
					throw new RuntimeException("�ͷ���Դʧ��");
				}
			}
		}
	}
}