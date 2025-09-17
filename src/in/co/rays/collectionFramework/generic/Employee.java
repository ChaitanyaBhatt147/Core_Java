package in.co.rays.collectionFramework.generic;

public class Employee {
	private String name;
	private int salary;
	private String company;
	
	public Employee(String name, int salary, String company) {
		this.name = name;
		this.salary = salary;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Name: "+ name+"\tSalary: "+salary+"\tCompany: "+company;
	}
}
