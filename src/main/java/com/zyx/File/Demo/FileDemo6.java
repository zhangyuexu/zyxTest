package com.zyx.File.Demo;

import java.io.File;

/*
 *  File类获取功能
 *  list
 *  listFiles
 */
public class FileDemo6 {
	public static void main(String[] args) {
		function_2();
	}
	public static void function_2(){
		//获取系统中的所有根目录
		File[] fileArr = File.listRoots();//返回的也是File对象数组
		for(File f : fileArr){
			System.out.println(f);
		}
	}
	
	/*
	 *  File类的获取功能
	 *  File[] listFiles() 返回的是File对象数组
	 *  获取到,File构造方法中封装的路径中的文件和文件夹名 (遍历一个目录)
	 *  返回的是目录或者文件的全路径
	 */
	public static void function_1(){
		File file = new File("d:\\eclipse");
		File[] fileArr = file.listFiles();
		for(File f : fileArr){
			System.out.println(f);
		}
	}
	
	/*
	 *  File类的获取功能
	 *  String[] list()返回的是字符串数组
	 *  获取到,File构造方法中封装的路径中的文件和文件夹名 (遍历一个目录)
	 *  返回只有名字
	 */
	public static void function(){
		File file = new File("c:");
		String[] strArr = file.list();
		System.out.println(strArr.length);
		for(String str : strArr){
			System.out.println(str);
		}
	}
}