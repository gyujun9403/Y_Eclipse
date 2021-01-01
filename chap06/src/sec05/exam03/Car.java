package sec05.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println("현재 속도 : " + speed);
	}
	
	public static void main(String[] args) {
		//speed = 60;	인스턴스 메소드는 static 클래스 내부에서 바로 사용 불가
		//run();		
		//this.speed = 60; static 매소드 내부에서는 this 또한 사용 불가
		Car car = new Car();//인스턴스 필드/메소드는 객체로 만들고 나서 정적 매소드에서 사용 가능  
		car.speed = 60;
		car.run();
	}

}
