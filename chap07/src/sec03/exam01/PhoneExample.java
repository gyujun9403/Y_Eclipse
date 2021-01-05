package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone("연규준"); Cannot instantiate the type Phone
		SmartPhone smartphone = new SmartPhone("연규준");
		
		smartphone.on();	//추상클래스인 부모클래스의 메소드
		smartphone.off();	//추상클래스인 부모클래스의 메소드
		smartphone.web();	//자식클래스의 메소드
	}

}
