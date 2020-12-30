package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		
		if(s1 != s2)
			System.out.println("s1과 s2는 서로 다른 객체를 참조한다.");
	}

}
