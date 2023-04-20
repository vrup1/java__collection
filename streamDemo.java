package vrushaliproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class streamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fos=new FileOutputStream("C:\\javapractice\\fileoutStreamDemo.txt");
String str="I am from fileoutStreamdemo file";
byte bStr[]=str.getBytes();
fos.write(bStr);
fos.close();

FileInputStream fis=new FileInputStream("C:\\javapractice\\fileoutStreamDemo.txt");
int endOfFile=0;
while((endOfFile=fis.read())!=-1) {
	System.out.print((char)endOfFile);
}

	}

}
