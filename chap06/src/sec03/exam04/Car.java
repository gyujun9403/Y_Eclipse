package sec03.exam04;

public class Car {
	String model, color;
	int maxSpeed;
	Car(){System.out.println("Car() ������ ȣ��");}
	
	Car(String model){
		this(model, "����", 250); // this�� ������ ���� ù�ٿ� ȣ��Ǿ���Ѵ�.
		System.out.println("Car(String model) ������ ȣ��");
	}
	Car(String model, String color){
		this(model, color, 250);
		System.out.println("Car(String model, String color) ������ ȣ��");
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("Car(String model, String color, int maxSpeed) ������ ȣ��");
	}
}
