package Summery;

public class A_Outer2 {
	int fieldA_instnace;
	static int fieldA_static;
	void methodA_instance() {}
	static void methodA_static() {}
	
	//1. 정적 멤버 클래스는 바깥 클래스에서 인스턴스/정적으로 객체를 생성 할 수 있다.
	C_static c1 = new C_static();
	static C_static c2 = new C_static();
	
	
	void method1() { C_static c1 = new C_static();}
	static void method2() { 
		C_static c1 = new C_static();
		//fieldA_instnace = 1;
		fieldA_static = 1;		
		}
	//↑근데 이거 final인거 같다. static 붙이면 final만 사용 가능하다고 에러 뜸. 로컬클래스에서 사용 제한 확인.
	
	
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
			 * 정적인 메소드/멤버 클래스 내부에서는 외부의 인스턴스를 변경하거나 호출 할 수 없다.
			 * 정적인 멤버 클래스 내부에서는 인스턴스형 필드 및 메소드나 정적 필드 및 메소드를 생성 할 수 없다.
			 * static이 메모리에 올려지는 시점이 instance보다 빠르기 때문이라고 생각하기 때문이다.
			 * 
			 * 근데 생각해보니 클래스는 전부 instance던 static이건 static영역에 올려진다고 들었는데, 
			 * 그럼 그냥 instnace건 static이건 클래스 내부에서 외부의 instance필드나 instance 메소드를 사용못해야 하는거 아닌가???
			 * */
		}
	}
}
