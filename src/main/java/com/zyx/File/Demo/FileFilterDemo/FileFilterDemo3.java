package com.zyx.File.Demo.FileFilterDemo;

import java.io.File;

public class FileFilterDemo3 {

	public static void main(String[] args) {
		File dir=new File("d:\\apm");
		if(dir.exists()){
			getFilterFile(dir);
		}
		else{
			System.out.println("该路径不存在");
		}
	}
	public static void getFilterFile(File dir){
		File[] files=dir.listFiles(new MyFilter3());//在这里加入过滤器
		for(File file:files){
			if(file.isDirectory()){
				getFilterFile(file);
			}
			else{
				System.out.println(file);
			}
		}
	}

}
