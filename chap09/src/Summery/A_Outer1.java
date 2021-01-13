package Summery;

class A_Outer1 {
	int fieldA_instance;
	static int fieldA_static;
	void methodA_instance() {}
	static void methodA_static() {}
	
	//***1. �ܺ� Ŭ�������� �ν��Ͻ� ��� Ŭ���� ��ü ����(�ܺο��� ��� Ŭ���� ����)***
	B_instance b1 = new B_instance();
	//static B_instance b2 = new B_instance();
	void method1() {B_instance b1 = new B_instance();}
	//static void method2() {B_instance b1 = new B_instance();}
	/*
	 * No enclosing instance of type A_Outer1 is accessible. 
	 * Must qualify the allocation with an enclosing instance of type A_Outer1 
	 * (e.g. x.new A() where x is an instance of A_Outer1).
	 * */
	
	
	class B_instance{
		//***2. �ν��Ͻ� ��� Ŭ���� ���ο��� ���� �� �޼ҵ� ����
		int field1;
		//static int field2;
		//The field field2 cannot be declared static in a non-static inner type, unless initialized with a constant expression
		void method1() {}
		//static void method2() {}
		//The field field2 cannot be declared static in a non-static inner type, unless initialized with a constant expression
		
		void methodB() {
		//***3. �ν��Ͻ� ��� Ŭ���� ���ο��� �ܺ� �ʵ� �� �޼ҵ� ����(��� Ŭ�������� )
			fieldA_instance = 1;
			fieldA_static = 1;
			methodA_instance();
			methodA_static();
		}
	}
	/*
	 * 
	 * */
}
