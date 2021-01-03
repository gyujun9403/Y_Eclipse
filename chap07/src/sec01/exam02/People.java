package sec01.exam02;

public class People {
	public String name, ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public void Print() {
		System.out.println("¿Ã∏ß	: " + this.name);
		System.out.println("SSN	: " + this.ssn);
	}
}
