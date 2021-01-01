package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		//static을 사용하면 객체를 생서하지 않아도 클래스 단위에서 사용할 수 있다.
		double result1 = 7*7*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

	}

}
