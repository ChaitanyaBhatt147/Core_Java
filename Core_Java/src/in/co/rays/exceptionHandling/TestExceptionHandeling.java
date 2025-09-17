package in.co.rays.exceptionHandling;

public class TestExceptionHandeling {
	public static void main(String[] args) {
		try {
			int a= 5;
			int b= 0;
			int c = a/b;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			System.out.println("exception: "+ e.getMessage());
			e.getStackTrace();
		}
		System.out.println("Program complited");
		
	}
}
