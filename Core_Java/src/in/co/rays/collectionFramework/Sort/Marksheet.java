package in.co.rays.collectionFramework.Sort;

public class Marksheet implements Comparable<Marksheet>{
	
	public String rollNo;
	public String name;
	public int phy;
	
	public Marksheet(String rollno, String name, int phy) {
		this.rollNo = rollno;
		this.name = name;
		this.phy = phy;
	}
	
	@Override
	public int compareTo(Marksheet o) {
		if (this.name == o.name) {
			return this.rollNo.compareTo(o.rollNo);
		} else {
			return this.name.compareTo(o.name);
		}
	}
	@Override
	public String toString() {
		return "Name: "+ name+"\tRollNo: "+rollNo+"\tphy: "+phy;
	}
	
}
