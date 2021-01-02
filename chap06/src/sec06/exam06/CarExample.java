package sec06.exam06;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		Scanner scanner = new Scanner(System.in);
		String str;
		while(true) {
			System.out.print("주행하시겠습니까?(Y/N) : ");
			str = scanner.next();
			if(str.equals("Y")) {
				car.setStop(false);
			}
			else {
				car.setStop(true);
				break;
			}
			System.out.print("입력 속도 : ");
			car.setSpeed(scanner.nextInt());
			System.out.println("정지 여부 : " + car.isStop());
			System.out.println("현재 속도 : " + car.getSpeed() + "km/h");
		}
		System.out.print("프로그램을 종료합니다...");
		scanner.close();
	}

}
