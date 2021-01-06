package newExmaple;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class createFolder {
	public static void main(String args[]) throws IOException {
		File f1=new File("C:\\Users\\a744450\\Desktop\\NewFile");
		f1.mkdir();		
		f1.setWritable(true);
		
		FileUtils.copyDirectory(new File("C:\\Users\\a744450\\Desktop\\example"), new File("C:\\Users\\a744450\\Desktop\\NewFile\\"));
	}
}
