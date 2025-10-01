package in.co.rays.threads;

public class TestAccountThread {
	public static void main(String[] args) {
		AccountThread t1 = new AccountThread("ram");
		AccountThread t2 = new AccountThread("Shyam");
		t1.start();
		t2.start();
	}
}
