package com.zyx.File.Demo.FileFilterDemo;

import java.io.File;
import java.io.FileFilter;

public class MyFilter3 implements FileFilter {

	public boolean accept(File pathname) {
		if(pathname.isDirectory()){
			return true;
		}
		else{
			return pathname.getName().toLowerCase().endsWith(".txt");
		}
	}

}
