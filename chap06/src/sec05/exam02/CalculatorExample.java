package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		//static�� ����ϸ� ��ü�� �������� �ʾƵ� Ŭ���� �������� ����� �� �ִ�.
		double result1 = 7*7*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

	}

}
