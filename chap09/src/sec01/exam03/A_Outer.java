package sec01.exam03;

public class A_Outer {
	int field1_instance;
	void method_instance() { }
	
	static int field_static;
	static void method_static() { }
	
	class B_instance {
		void method() {
			field1_instance = 10;
			method_instance();

			field_static = 10;
			method_static();
		}
	}
	
	static class C {
		void method() {
			//field1_instance = 10;
			//method_instance();

			field_static = 10;
			method_static();
		}
	}	
}
