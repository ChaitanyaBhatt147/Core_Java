package in.co.rays.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e = new Employee(1,45000);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C://IO//Employee.xls"));
		out.writeObject(e);
		out.close();
		System.out.println("Done");
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://IO//Employee.xls"));
		e = (Employee) in.readObject();
		in.close();
		System.out.println(e);
	}
}
