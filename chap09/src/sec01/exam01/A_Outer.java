package sec01.exam01;

class A_Outer {
	
	A_Outer() {System.out.println("A_Outer ��ü ����");}
	//instance ��� Ŭ�������ο����� static�ʵ�/�޼ҵ带 ������ �� ����. static ����?�Ҵ�?���� instance�� ����?�Ҵ�?�Ǳ� �����̴�. 
	class B_Instance{
		B_Instance(){System.out.println("B_Instance ��ü�� ������");}
		int feild1;
		//int static field2; Syntax error on token "static", delete this token
		void method1() {};
		//static void method2() {} The method method2 cannot be declared static; static methods can only be declared in a static or top level type
	}
	//static ��� Ŭ�������ο����� static�ʵ�/�޼ҵ带 ������ �� �ִ�. static ����?�Ҵ�?���� instance�� ����?�Ҵ�?�Ǳ� �����̴�.
	static class C_Static{
		C_Static(){System.out.println("C_Static ��ü�� ������");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
}
