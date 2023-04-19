package PracticesByVrushali;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileDemoOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File fl=new File("C:\\javapractice\\demoFile1.txt");

try {
	if (fl.createNewFile()) {
		System.out.println("new file is created successfully:"+fl.getAbsolutePath());
		
	}
	else {
		System.out.println("file alresdy present at the location");
		System.out.println("file Name:"+fl.getName());
		System.out.println("Can read the file:"+fl.canRead());
		System.out.println("Can write in the file:"+fl.canWrite());
		System.out.println("Can be exhecute filedata:"+fl.canExecute());
		System.out.println("get the address of file:"+fl.getPath());
		System.out.println("can get idea about free space in file:"+fl.getFreeSpace());
		System.out.println("shows changes in file:"+fl.lastModified());
		System.out.println("can be delete file:"+fl.delete());
	}
	if (fl.exists()) {
		FileWriter fw=new FileWriter(fl);
		fw.write("i am from this file");
		fw.close();
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
