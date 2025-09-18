package in.co.rays.collectionFramework.EqualsAndHashCodeMethod;

public class Student {
	private String name;
	private int rollNo;
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("Object is null");
			return false;
		}
		if (!(obj instanceof Student)) {
			System.out.println("Object is not of Student class");
			return false;
		}
		Student s = (Student) obj;
		if (this.name == s.name && this.rollNo == s.rollNo) {
			System.out.println("Both are same");
			return true;
		} else {
			System.out.println("Both are different");
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		String value = name + rollNo;
		return value.hashCode();
	}
}
