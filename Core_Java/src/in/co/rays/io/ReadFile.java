package in.co.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C://IO/Hello.txt");
		int i = fr.read();
//		while (i != -1) {
//			System.out.println(i);
//			i = fr.read();
//		}
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}
		fr.close();
	}
}
