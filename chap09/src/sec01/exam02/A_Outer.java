package sec01.exam02;

public class A_Outer {
	//instance �ɹ� Ŭ������ �ܺ� Ŭ������ ���� �ʵ��� �ʱⰪ�̳� ���� �޼ҵ忡�� ��ü�� ������ �� ����.
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
		
		//static �ɹ� Ŭ������ �ܺ� Ŭ�������� �����Ӱ� ��ü�� ������ �� �ִ�.
		C_Static c1 = new C_Static();
		static C_Static c2 = new C_Static();
		void methodA3() {C_Static c1 = new C_Static();}
		static void methodA4() {C_Static c1 = new C_Static();}
		
		
		class B_Instance {}
		static class C_Static {}
}	
