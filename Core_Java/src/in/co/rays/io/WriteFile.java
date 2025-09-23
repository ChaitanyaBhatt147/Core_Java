package in.co.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C://IO//Rays.txt");
		file.write("Hello Chaitanya \nHello Java");
		System.out.println("Data inserted Successfully");
		file.close();
	}
}
