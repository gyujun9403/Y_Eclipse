package sec06.exam06;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		Scanner scanner = new Scanner(System.in);
		String str;
		while(true) {
			System.out.print("�����Ͻðڽ��ϱ�?(Y/N) : ");
			str = scanner.next();
			if(str.equals("Y")) {
				car.setStop(false);
			}
			else {
				car.setStop(true);
				break;
			}
			System.out.print("�Է� �ӵ� : ");
			car.setSpeed(scanner.nextInt());
			System.out.println("���� ���� : " + car.isStop());
			System.out.println("���� �ӵ� : " + car.getSpeed() + "km/h");
		}
		System.out.print("���α׷��� �����մϴ�...");
		scanner.close();
	}

}
