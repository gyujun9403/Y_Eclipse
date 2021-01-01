package sec03.exam04;

public class Car {
	String model, color;
	int maxSpeed;
	Car(){System.out.println("Car() 생성자 호출");}
	
	Car(String model){
		this(model, "은색", 250); // this는 무조건 가장 첫줄에 호출되어야한다.
		System.out.println("Car(String model) 생성자 호출");
	}
	Car(String model, String color){
		this(model, color, 250);
		System.out.println("Car(String model, String color) 생성자 호출");
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("Car(String model, String color, int maxSpeed) 생성자 호출");
	}
}
