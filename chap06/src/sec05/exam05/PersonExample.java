package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person P1 = new Person("123456-1234567", "ø¨±‘¡ÿ");
		//P1.ssn = "654312";	The final field Person.ssn cannot be assigned
		System.out.println(P1.nation);
		System.out.println(P1.ssn);
		System.out.println(P1.name);
	}

}
