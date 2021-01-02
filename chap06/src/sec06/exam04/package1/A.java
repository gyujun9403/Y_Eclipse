package sec06.exam04.package1;

public class A {
	//생성자
	A(){}				//default의 기본 생성자
	public A(boolean b) {}	//public 생성자
	private A(String s) {}	//private 생성자
	
	A a1 = new A();			//접근 가능
	A a2 = new A(true);		//접근 가능
	A a3 = new A("string");	//접근 가능
}
