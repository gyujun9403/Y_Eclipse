package sec02.exam03;

import java.util.Scanner;

public class CarContol {

	public static void main(String[] args) {
		int rollNum, i = 0;
		//Car�� �����ϸ� ���ο��� Tire Ŭ������ �ڵ����� ���� ��.
		Car car = new Car();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ϴ� ���� ȸ�� Ƚ�� : ");
		rollNum = scanner.nextInt();
		
		while(i < rollNum) {
			car.run();
			i++;
		}
		scanner.close();		
	}

}
