package in.co.rays.io;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File file = new File("C://IO//Hello.txt");
		if (file.exists()) {
			System.out.println("Name: "+ file.getName());
			System.out.println("Absolue: "+ file.getAbsolutePath());
			System.out.println("Can Read: "+ file.canRead());
			System.out.println("Can Write: "+ file.canWrite());
			System.out.println("Is File: "+ file.isFile());
			System.out.println("Is Directory: "+ file.isDirectory());
			System.out.println("Last Modified: "+ file.lastModified());
			System.out.println("Length: "+ file.length());
		} else {
			System.out.println("File not found");
		}
	}
}
