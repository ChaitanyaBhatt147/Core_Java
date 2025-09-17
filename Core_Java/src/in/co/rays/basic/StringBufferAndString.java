package in.co.rays.basic;

public class StringBufferAndString {
	public static void main(String[] args) {
		String str = "Chaitanya";
		System.out.println("Str = "+str);
		System.out.println(str.toLowerCase());
		System.out.println("Str = "+str);
		String str1 = str.toLowerCase();
		System.out.println("Str = "+str1);
		System.out.println("--------------------------");
		StringBuffer sb = new StringBuffer("Chaitanya");
		System.out.println("sb = "+ sb);
		System.out.println(sb.reverse());
		System.out.println("sb = "+ sb);
	}
}
