package sec01.exam02;

public class A_Outer {
	//instance 맴버 클래스는 외부 클래스의 정적 필드의 초기값이나 정적 메소드에서 객체를 생성할 수 없다.
		B_Instance b1 = new B_Instance();
		/*
		 * static B_Instance b2 = new B_Instance();
		 * No enclosing instance of type A_Outer is accessible. 
		 * Must qualify the allocation with an enclosing instance of type A_Outer 
		 * (e.g. x.new A() where x is an instance of A_Outer).
		*/
		void methodA1() {B_Instance b1 = new B_Instance();}
		/*static void methodA2() {B_Instance b2 = new B_Instance();}
		 * No enclosing instance of type A_Outer is accessible. 
		 * Must qualify the allocation with an enclosing instance of type A_Outer 
		 * (e.g. x.new A() where x is an instance of A_Outer).
		*/
		
		//static 맴버 클래스는 외부 클래스에서 자유롭게 객체를 생성할 수 있다.
		C_Static c1 = new C_Static();
		static C_Static c2 = new C_Static();
		void methodA3() {C_Static c1 = new C_Static();}
		static void methodA4() {C_Static c1 = new C_Static();}
		
		
		class B_Instance {}
		static class C_Static {}
}	
