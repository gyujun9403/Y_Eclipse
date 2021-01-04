package sec02.exam03;

import java.util.Scanner;

public class CarContol {

	public static void main(String[] args) {
		int rollNum, i = 0;
		//Car를 선언하면 내부에서 Tire 클래스가 자동으로 선언 됨.
		Car car = new Car();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원하는 바퀴 회전 횟수 : ");
		rollNum = scanner.nextInt();
		
		while(i < rollNum) {
			car.run();
			i++;
		}
		scanner.close();		
	}

}
