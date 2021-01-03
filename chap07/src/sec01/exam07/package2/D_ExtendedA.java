package sec01.exam07.package2;

import sec01.exam07.package1.*;

public class D_ExtendedA extends A_Super{
	D_ExtendedA(){
		super();
		this.field1 = "abc";
		this.method1();
	}
	
	public void methodD() {
		//super();	Constructor call must be the first statement in a constructor
		//A_Super a = new A_Super(); The constructor A_Super() is not visible
	}
}
