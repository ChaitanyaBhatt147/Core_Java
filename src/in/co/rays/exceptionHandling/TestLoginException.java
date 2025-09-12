package in.co.rays.exceptionHandling;

public class TestLoginException {
	public static void main(String[] args) throws LoginException {
		String id = "admin1234@gmail.com";
		if (id != null && id == "admin@gmail.com") {
			System.out.println("Login complit");
		} else {
			throw new LoginException("invalid id");
		}
	}
}
