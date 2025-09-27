package in.co.rays.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a = new Account(45000,1251);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C://IO//Account.xls"));
		out.writeObject(a);
		out.close();
		System.out.println("Done");
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://IO//Account.xls"));
		a = (Account) in.readObject();
		in.close();
		System.out.println(a);
	}
}
