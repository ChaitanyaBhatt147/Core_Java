package in.co.rays.collectionFramework.EqualsAndHashCodeMethod;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Chaitanya",216);
		Student s2 = new Student("Chaitanya",216);
		
		s1.equals(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
