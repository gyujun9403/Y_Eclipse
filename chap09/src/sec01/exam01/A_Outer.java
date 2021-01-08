package sec01.exam01;

class A_Outer {
	
	A_Outer() {System.out.println("A_Outer 객체 생성");}
	//instance 멤버 클래스내부에서는 static필드/메소드를 선얼할 수 없다. static 생성?할당?이후 instance가 생성?할당?되기 때문이다. 
	class B_Instance{
		B_Instance(){System.out.println("B_Instance 객체가 생성됨");}
		int feild1;
		//int static field2; Syntax error on token "static", delete this token
		void method1() {};
		//static void method2() {} The method method2 cannot be declared static; static methods can only be declared in a static or top level type
	}
	//static 멤버 클래스내부에서는 static필드/메소드를 선얼할 수 있다. static 생성?할당?이후 instance가 생성?할당?되기 때문이다.
	static class C_Static{
		C_Static(){System.out.println("C_Static 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
}
