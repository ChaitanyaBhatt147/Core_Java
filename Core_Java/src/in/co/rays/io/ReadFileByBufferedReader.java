package in.co.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileByBufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("C://IO//Hello.txt"));
		String s = file.readLine();
		while (s != null) {
			System.out.println(s);
			s= file.readLine();	
		}
		file.close();
	}
}
