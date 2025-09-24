package in.co.rays.io.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadEmail {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("C://IO//Email.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("C://IO//ValidEmail.txt"));
		String line = file.readLine();
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		while (line != null) {
			if (line.matches(emailRegex)) {
				System.out.println(line);
				out.write(line);
				out.newLine();
			} 
			line = file.readLine();
		}
		file.close();
		out.close();
		System.out.println("Email Saved Successfully");
	}
}
