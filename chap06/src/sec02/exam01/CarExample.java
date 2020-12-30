package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		
		myCar.speed = 660;
		if(myCar.maxSpeed > myCar.speed) {
			System.out.println("현재 속도는 " + myCar.speed + "km/h 이며, 적정 속도 입니다.");
		}
		else {
			myCar.speed = myCar.maxSpeed;
			System.out.println("현재 속도는 " + myCar.speed + "km/h 이며, 최고 속도 입니다.");
		}
	}

}
