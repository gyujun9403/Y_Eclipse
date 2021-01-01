package sec03.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		PrintCarclass(car1);
		
		Car car2 = new Car("sedan");
		PrintCarclass(car2);
		
		Car car3 = new Car("SUV", "Black");
		PrintCarclass(car3);
		
		Car car4 = new Car("Wagon", "Red", 200);
		PrintCarclass(car4);
	}
	
	
	public static void PrintCarclass(Car car) {
		System.out.println("Model    : " + car.model);
		System.out.println("Color    : " + car.color);
		System.out.println("maxSpeed : " + car.maxSpeed);
		System.out.println();
	}
}
