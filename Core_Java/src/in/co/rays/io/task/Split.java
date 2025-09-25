package in.co.rays.io.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Split {
	public static void main(String[] args) throws IOException {
		String s = "C://IO//Mearge.txt";
		
		File file = new File(s);
		
		int nol = 2,count = 0;
		
		Scanner sc = new Scanner(file);
		
		while (sc.hasNext()) {
			sc.nextLine();
			count++;
		}
		System.out.println("number of lines: "+ count);
		
		int temp = count/nol,rem = count%nol,nof =0;
		if (temp != 0) {
			nof = temp;
		}
		if (rem != 0) {
			nof++;
		} else {
			nof = temp;
		}
		System.out.println("No of Files: "+nof);
		BufferedReader br = new BufferedReader(new FileReader(s));
		String str;
		for (int i = 1; i <= nof; i++) {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C://IO//"+i+".txt"));
			str = br.readLine();
			for (int j = 1; j <= nol; j++) {
				if (str != null) {
					bw.write(str);
					if (j != nol) {
						bw.newLine();
						str = br.readLine();
					}
				}
			}
			bw.close();
		}
		br.close();
	}
}
