package in.co.rays.basic;

public class TwoDArrey {
	public static void main(String[] args) {
		int [] [] table = new int [9] [10];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < 10; j++) {
				table[i][j]= (i+2)*(j+1);
			}
		}
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(table[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
