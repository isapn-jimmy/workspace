package com.lcpan.m10;

import java.io.*;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\dir");
		dir.mkdir();//產生資料夾
		System.out.println(dir.isDirectory());//是資料夾的的話,return true
		File file = new File(dir, "input.txt");//在dir,產生"input.txt"
		file.createNewFile();//產生檔案
		System.out.println(file.isFile());//是檔案的的話,return true
		File newDir = new File("C:\\testDir");//建立新的資料夾newDir
		dir.renameTo(newDir);//重新命名
		System.out.println(file.getName());
	}
}
