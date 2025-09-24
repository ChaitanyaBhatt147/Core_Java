package in.co.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	public static void main(String[] args) throws IOException {
		String source = "C://Users//Lenovo//Desktop//Wallpaper//11020486.png";
		String target = "C://IO//image1.png";
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
		int ch = in.read();
		while(ch != -1) {
			out.write(ch);
			ch = in.read();
		}
		out.close();
		in.close();
		System.out.println("done");
	}
}
