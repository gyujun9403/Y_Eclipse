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
			System.out.println("���� �ӵ��� " + myCar.speed + "km/h �̸�, ���� �ӵ� �Դϴ�.");
		}
		else {
			myCar.speed = myCar.maxSpeed;
			System.out.println("���� �ӵ��� " + myCar.speed + "km/h �̸�, �ְ� �ӵ� �Դϴ�.");
		}
	}

}
