package Summery;

public class A_Outer2 {
	int fieldA_instnace;
	static int fieldA_static;
	void methodA_instance() {}
	static void methodA_static() {}
	
	//1. ���� ��� Ŭ������ �ٱ� Ŭ�������� �ν��Ͻ�/�������� ��ü�� ���� �� �� �ִ�.
	C_static c1 = new C_static();
	static C_static c2 = new C_static();
	
	
	void method1() { C_static c1 = new C_static();}
	static void method2() { 
		C_static c1 = new C_static();
		//fieldA_instnace = 1;
		fieldA_static = 1;		
		}
	//��ٵ� �̰� final�ΰ� ����. static ���̸� final�� ��� �����ϴٰ� ���� ��. ����Ŭ�������� ��� ���� Ȯ��.
	
	
	static class C_static {
		int field1;
		static int field2;
		
		void method1() {}
		static void method2() {}
		
		void methodC() {
			//fieldA_instnace = 1;
			fieldA_static = 1;
			
			//methodA_instance();
			methodA_static();
			/*
			 * ������ �޼ҵ�/��� Ŭ���� ���ο����� �ܺ��� �ν��Ͻ��� �����ϰų� ȣ�� �� �� ����.
			 * ������ ��� Ŭ���� ���ο����� �ν��Ͻ��� �ʵ� �� �޼ҵ峪 ���� �ʵ� �� �޼ҵ带 ���� �� �� ����.
			 * static�� �޸𸮿� �÷����� ������ instance���� ������ �����̶�� �����ϱ� �����̴�.
			 * 
			 * �ٵ� �����غ��� Ŭ������ ���� instance�� static�̰� static������ �÷����ٰ� ����µ�, 
			 * �׷� �׳� instnace�� static�̰� Ŭ���� ���ο��� �ܺ��� instance�ʵ峪 instance �޼ҵ带 �����ؾ� �ϴ°� �ƴѰ�???
			 * */
		}
	}
}
