package com.zyx.File.Demo;

import java.io.File;

/*
 *  ��һ��Ŀ¼���µ���������,������ȫ�ı���
 *  ��̼���,�����ĵݹ����,�Լ������Լ�
 */
public class FileDemo7 {
	public static void main(String[] args) {
		File dir = new File("d:\\eclipse");
		getAllDir(dir);
	}
	/*
	 *  ���巽��,ʵ��Ŀ¼��ȫ����
	 */
	public static void getAllDir(File dir){
		System.out.println(dir);
		//���÷���listFiles()��Ŀ¼,dir���б���
		File[] fileArr = dir.listFiles();
		for(File f : fileArr){
			//�жϱ���f��ʾ��·���ǲ����ļ���
			if(f.isDirectory()){
				//��һ��Ŀ¼,��Ҫȥ�������Ŀ¼
				//������,getAllDir,���Ǹ���Ŀ¼ȥ����
				//��������getAllDir,������Ŀ¼
				getAllDir(f);
			}else{
				System.out.println(f);
			}
		}
	}
}
