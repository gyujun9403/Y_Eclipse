package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다");
			System.exit(0);
		}
		//프로그램을 실행할 때 args배열을 매개로 프로그램에 바로 데이터(설정/초기값의 용도 등등...)을 전달할 수 있다.
		//cmd에서 프로그램을 실행할 때 아래와 같이 10과 20이라는 값을 바로 보낼 수 있다.
		//java -p . -m chap05/sec02.exam05.MainStringArratArgument 10 20
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
