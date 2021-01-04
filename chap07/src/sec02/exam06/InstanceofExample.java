package sec02.exam06;

public class InstanceofExample {
	//instanceof를 통한 강제 변환 여부 확인 후 변환
	public static void method1(Parent p) {
		if(p instanceof Child) {
			Child c = (Child) p;
			System.out.println("method1에 의해 Child로 변환 성공");
		}
		else {System.out.println("method1에서는 Child로 변환 불가");}
	}
	//그냥 강제 변환
	public static void method2(Parent p) {
		Child c = (Child) p;
		System.out.println("method2에 의해 Child로 변환 성공");	
	}

	public static void main(String[] args) {
		//pA는 자동 객체 형변환된 자식 요소.
		Parent pA = new Child();
		//부모로 자동 형변환 된 자식 객체를 강제 형변환을 통해 다시 자식 요소로 변환
		method1(pA);
		method2(pA);
		
		//pB는 그냥 부모요소.
		Parent pB = new Parent();
		//부모 요소를 자식 요소로 강제 형 변환
		method1(pB);
		method2(pB);
	}

}
