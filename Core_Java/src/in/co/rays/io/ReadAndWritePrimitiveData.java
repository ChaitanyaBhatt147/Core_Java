package in.co.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveData {
	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("C://IO//binary.txt"));
		out.writeInt(5);
		out.writeBoolean(true);
		out.writeChar('c');
		out.writeDouble(2.222);
		DataInputStream in = new DataInputStream(new FileInputStream("C://IO//binary.txt"));
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		in.close();out.close();
	}

}
