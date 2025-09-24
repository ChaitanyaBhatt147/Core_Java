package in.co.rays.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeybord {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter("C://IO//Keybord.txt");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(in);
		String line = input.readLine();
		while (!line.equals("quit")) {
			out.println(line);
			line = input.readLine();
		}
		out.close();in.close();input.close();
	}
}
