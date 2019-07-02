package com.zyx.InputStream.demo;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *  FileInputStream读取文件
 *   读取方法  int read(byte[] b) 读取字节数组
 *   数组作用: 缓冲的作用, 提高效率
 *   read返回的int,表示什么含义 读取到多少个有效的字节数
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:\\a.txt");
		//创建字节数组
		byte[] b = new byte[1024];
		
		int len = 0 ;
		while( (len = fis.read(b)) !=-1){//这里的len表示每次读取到字节数组的字节数的个数
			System.out.print(new String(b,0,len));
		}
		fis.close();
	}
}
/*
 * 
		int len = fis.read(b);
		System.out.println(new String(b));//ab
		System.out.println(len);//2
		
		len = fis.read(b);
		System.out.println(new String(b));//cd
		System.out.println(len);//2
		
		len = fis.read(b);
		System.out.println(new String(b));//ed
		System.out.println(len);//1
		
		len = fis.read(b);
		System.out.println(new String(b));//ed
		System.out.println(len);//-1
		*/