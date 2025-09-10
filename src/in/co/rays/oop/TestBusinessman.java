package in.co.rays.oop;
import java.util.Scanner;
public class TestBusinessman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Busenessman bm = new Busenessman();
		Buseness b = new Buseness();
		Ngo n = new Ngo();
		bm.setName(sc.nextLine());
		b.setName(sc.nextLine());
		n.setName(sc.nextLine());
		bm.earnMoney();
		bm.donate();
		bm.party();
		b.donate();
		b.earnMoney();
		b.party();
		b.helpToOuther();
		n.helpToOuther();
		sc.close();
	}
}
