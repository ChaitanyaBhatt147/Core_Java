package in.co.rays.exceptionHandling;

public class CheckedException {
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		try {
			mom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void mom() throws Exception {
		son();		
	}
	public static void son() throws Exception {
		throw new Exception("Made mistake");
	}
}
