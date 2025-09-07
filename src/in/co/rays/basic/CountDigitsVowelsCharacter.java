package in.co.rays.basic;
import java.util.*;
public class CountDigitsVowelsCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string in which you have to find the number of digits: ");
		String str1 = sc.nextLine();
		System.out.println();
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (Character.isDigit(str1.charAt(i))) {
				count++;
			}
		}
		System.out.println("Number of digits in "+str1+" is: "+count);
		count =0;
		System.out.print("Enter the string in which you have to find the number of vowels: ");
		String str2 = sc.nextLine();
		System.out.println();
		for (int i = 0; i < str2.length(); i++) {
			if ('a' == str2.charAt(i)||'e' == str2.charAt(i)||'i' == str2.charAt(i)||'o' == str2.charAt(i)||'u' == str2.charAt(i)) {
				count++;
			}
		}
		System.out.println("Number of vowels in "+str2+" is: "+count);
		System.out.print("Enter the string in which you have to find the number of all character occurrence: ");
		String str3 = sc.nextLine();
		System.out.println();
		String unique="";
		for (int i = 0; i < str3.length(); i++) {
			if (unique.indexOf(str3.charAt(i)) == -1) {
				unique += str3.charAt(i);
			}
		}
		for (int i = 0; i < unique.length(); i++) {
			count =0;
			for (int j = 0; j < str3.length(); j++) {
				if (str3.charAt(j) == unique.charAt(i)) {
					count++;
				}
			}
			System.out.println("The character '"+unique.charAt(i)+"' occurrence "+count+" tines in "+ str3);
			
		}
		
		sc.close();
	}
}
