package sec04.exam02;

public class Computerexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		int reuslt2 = myCom.sum2(new int[] {1, 2, 3});
		System.out.println("result2 : " + reuslt2);
		
		//...�� �̿��ϸ� �������� �Ű������� ,�� �����Ͽ� �ް� �ڵ����� �迭�� ��ȯ���ش�. 
		int reuslt3 = myCom.sum2(1, 2, 3);
		System.out.println("result3 : " + reuslt3);
		
		int reuslt4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 : " + reuslt4);
	}

}
