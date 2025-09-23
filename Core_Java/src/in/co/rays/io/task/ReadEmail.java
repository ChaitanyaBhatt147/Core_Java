package in.co.rays.io.task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadEmail {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("C://IO//Email.txt"));
		String line = file.readLine();
		while (line != null) {
			if (line.endsWith("@gmail.com") || line.endsWith("@outlook.com") || line.endsWith("@hotmail.com")) {
				System.out.println(line);
				line = file.readLine();
			} else {
				line = file.readLine();
			}
		}
		file.close();
	}
}
