package in.co.rays.basic;
import java.util.*;
public class FindTheInteger {
	public static int [] num;
	public static int find,start,mid,end,len;
	public static boolean found = !true;
	public static int mid(int start, int end) {
	    int mid = start + (end - start) / 2;
	    return mid;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		len = sc.nextInt();
		num = new int[len];
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Enter the elements you have to find:  ");		
		find = sc.nextInt();
		start =0;
		end = len-1;
		while (start <= end) {
			mid = mid(start,end);
			if(num[mid] == find) {
				System.out.println(mid+1);
				found = true;
				break;
			}else if (num[mid] < find) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		if (!found) {
			System.out.println("-");
		}
		sc.close();
	}
}
