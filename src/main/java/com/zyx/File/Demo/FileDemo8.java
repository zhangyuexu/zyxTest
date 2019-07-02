package com.zyx.File.Demo;

import java.io.File;

public class FileDemo8 {
	public static void main(String[] args) {
		File dir=new File("d:\\ap");
		if(dir.exists()){
			getAllDir(dir);
		}
		else{
			System.out.println("该路径不存在");
		}
	}
	public static void getAllDir(File dir){
		File[] files=dir.listFiles();
		for(File file:files){
			if(file.isDirectory()){
				getAllDir(file);
			}
			else{
				System.out.println(file);
			}
		}
	}
}
