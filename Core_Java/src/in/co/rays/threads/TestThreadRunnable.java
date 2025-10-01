package in.co.rays.threads;

public class TestThreadRunnable {
	public static void main(String[] args) {
		Thread r1 = new Thread(new ThreadRunnable("ram"));
		Thread r2 = new Thread(new ThreadRunnable("shyam"));
		r1.start();
		r2.start();
	}
}
