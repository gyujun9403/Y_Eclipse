package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		float f1 = 3.14f;
		double d1 = 3.14;
		
		float f2 = 0.1234567890123456789f;
		double d2 = 0.1234567890123456789;
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
		System.out.println("f2 : " + f2);
		System.out.println("d2 : " + d2);
		
		double d3 = 3e6;
		float f3 = 3e6f;
		double d4 = 2e-3;
		
		System.out.println("d3 : " + d3);
		System.out.println("f3 : " + f3);
		System.out.println("d4 : " + d4);
	}

}
