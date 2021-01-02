package sec06.exam04.package1;

public class B {
	A a1 = new A();			//접근 가능
	A a2 = new A(true);		//접근 가능
	//A a3 = new A("string");	The constructor A(String) is not visible
}
