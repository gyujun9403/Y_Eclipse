package sec01.exam02;

public class Student extends People{
	private int studentNo;
	
	public Student(String name, String ssn, int studentNO) {
		super(name, ssn); this.studentNo = studentNo;
	}
	
	@Override
	public void Print() {
		super.Print();
		System.out.println("StudentNo	: " + this.studentNo);
	}
}
