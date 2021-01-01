package sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		System.out.print("myCalcu.areaRectangle(10.5)       : ");
		System.out.println(myCalcu.areaRectangle(10.5));
		System.out.print("myCalcu.areaRectangle(10.5, 20.5) : ");
		System.out.println(myCalcu.areaRectangle(10.5, 20.5));
	}

}
