package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
	public C () {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;	The field A.field2 is not visible
		//a.field3 = 1;	The field A.field3 is not visible
		
		a.method1();
		//a.method2();	The method method2() from the type A is not visible
		//a.method3();	The method method3() from the type A is not visible
	}
}
 