package com.zyx.File.Demo.FileFilterDemo;

import java.io.File;
import java.io.FileFilter;

public class MyFilter2 implements FileFilter {
	public boolean accept(File pathname) {
		//判断获取的是目录,直接返回true
		if(pathname.isDirectory())
			return true;
		return pathname.getName().toLowerCase().endsWith(".java");
	}

}
