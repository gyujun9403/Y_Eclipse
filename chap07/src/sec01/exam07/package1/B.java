package sec01.exam07.package1;

public class B {
	public void methodB() {
		A_Super a = new A_Super();
		a.field1 = "abc";
		a.method1();
	}
	//A_Super a = new A_Super();
	//a.field1 = "abc";
	//Syntax error on token "field1", VariableDeclaratorId expected after this token
	
}
