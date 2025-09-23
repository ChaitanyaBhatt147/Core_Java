package in.co.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileByBufferedWriter {
	public static void main(String[] args) throws IOException {
		BufferedWriter file = new BufferedWriter(new FileWriter("C://IO/Rays.txt"));
		file.write("Hello Chaitanya");
		file.newLine();
		file.write("Hello Chaitanya");
		file.close();
		System.out.println("Data added Successfully");
	}
}
