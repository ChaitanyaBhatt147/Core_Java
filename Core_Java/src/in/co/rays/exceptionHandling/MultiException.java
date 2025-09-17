package in.co.rays.exceptionHandling;

public class MultiException {
	public static void main(String[] args) {
		String str = "Google";
		try {
			System.out.println("length: "+ str.length());
			System.out.println("char: " + str.charAt(6));
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.getStackTrace();
		}
	}

}
