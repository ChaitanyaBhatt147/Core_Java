package in.co.rays.io.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mearge {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("C://IO//Hello.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("C://IO//java.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("C://IO//Mearge.txt"));
		String line1,line2;
		line1=br1.readLine();
		line2=br2.readLine();
		while (line1 != null) {
			out.write(line1);
			out.newLine();
			line1=br1.readLine();
		}
		while (line2 != null) {
			out.write(line2);
			out.newLine();
			line2=br2.readLine();
		}
		System.out.println("murged Success");
		br1.close();br2.close();out.close();
	}
}
