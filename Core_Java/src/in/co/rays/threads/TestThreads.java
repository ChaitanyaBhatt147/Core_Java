package in.co.rays.threads;

public class TestThreads {
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread("Ram");
		HelloThread t2 = new HelloThread("Shyam");
		
		t1.start();
		t2.start();
		
	}
}
