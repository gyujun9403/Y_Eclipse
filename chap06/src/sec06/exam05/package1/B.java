package sec06.exam05.package1;

public class B {
	/*
	 A a = new A();
	 a.field1 = 1;
	 Syntax error on token "i", VariableDeclaratorId expected after this token
	*/
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1;	The field A.field3 is not visible
		
		a.method1();
		a.method2();
		//a.method3();	The method method3() from the type A is not visible
	}
	
}

