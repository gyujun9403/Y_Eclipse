package sec05.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println("���� �ӵ� : " + speed);
	}
	
	public static void main(String[] args) {
		//speed = 60;	�ν��Ͻ� �޼ҵ�� static Ŭ���� ���ο��� �ٷ� ��� �Ұ�
		//run();		
		//this.speed = 60; static �żҵ� ���ο����� this ���� ��� �Ұ�
		Car car = new Car();//�ν��Ͻ� �ʵ�/�޼ҵ�� ��ü�� ����� ���� ���� �żҵ忡�� ��� ����  
		car.speed = 60;
		car.run();
	}

}
