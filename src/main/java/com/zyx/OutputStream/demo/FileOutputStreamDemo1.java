package com.zyx.OutputStream.demo;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   FileOutputStream是OutputStream的子类(即实现类)
 *   写入数据文件,学习父类方法,使用子类对象
 *   
 *   子类中的构造方法: 作用:绑定输出的输出目的
 *   FileOutputStream(File file) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *   FileOutputStream(File file, boolean append) 追加写。
 *   FileOutputStream(String name) 创建一个向具有指定名称的文件中写入数据的输出文件流。
 *   FileOutputStream(String name, boolean append) 追加写
 *   
 *   子类的write方法：
 *   write(int b)  将指定字节写入此文件输出流
 *   write(byte[] b) 将 b.length 个字节从指定 byte 数组写入此文件输出流中
 *   write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流
 *   
 *   流对象使用步骤
 *     1. 创建流子类的对象,绑定数据目的
 *     2. 调用流对象的方法write写
 *     3. close释放资源
 *     
 *    流对象的构造方法,可以创建文件,如果文件存在,直接覆盖
 */
public class FileOutputStreamDemo1 {
	public static void main(String[] args)throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\a.txt");
		//流对象的方法write写数据
		//写1个字节
		fos.write(97);
		
		//写字节数组
		byte[] bytes = {65,66,67,68};
		fos.write(bytes);
		
		//写字节数组的一部分,开始索引,写几个
		fos.write(bytes, 1, 2);
		
		//写入字节数组的简便方式
		//写字符串
		fos.write("hello".getBytes());

		//关闭资源
		fos.close();
		
	}
}