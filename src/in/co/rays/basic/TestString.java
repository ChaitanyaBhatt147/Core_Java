package in.co.rays.basic;
import java.util.*;
public class TestString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String name = sc.nextLine();
		System.out.println();
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(name.length()-1));
		System.out.print("Enter the charactor whose index you have to find: ");
		char c = sc.nextLine().charAt(0);
		System.out.println();
		System.out.println(name.indexOf(c));
		System.out.println(name.lastIndexOf(c));
		System.out.println(name.toUpperCase());		
		System.out.println(name.toLowerCase());
		System.out.print("Enter the sub String to check that the above string starts from there or not: ");
		String str1 = sc.nextLine();
		System.out.println();
		System.out.println(name.startsWith(str1));		
		System.out.print("Enter the sub String to check that the above string starts from there or not: ");		
		String str2 = sc.nextLine();
		System.out.println();
		System.out.println(name.endsWith(str2));		
		System.out.println("Enter the index from where to whare you have to print the above string: ");
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(name.substring(a, b));		
		sc.close();
	}
}
