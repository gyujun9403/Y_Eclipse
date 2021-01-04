package sec02.exam06;

public class InstanceofExample {
	//instanceof�� ���� ���� ��ȯ ���� Ȯ�� �� ��ȯ
	public static void method1(Parent p) {
		if(p instanceof Child) {
			Child c = (Child) p;
			System.out.println("method1�� ���� Child�� ��ȯ ����");
		}
		else {System.out.println("method1������ Child�� ��ȯ �Ұ�");}
	}
	//�׳� ���� ��ȯ
	public static void method2(Parent p) {
		Child c = (Child) p;
		System.out.println("method2�� ���� Child�� ��ȯ ����");	
	}

	public static void main(String[] args) {
		//pA�� �ڵ� ��ü ����ȯ�� �ڽ� ���.
		Parent pA = new Child();
		//�θ�� �ڵ� ����ȯ �� �ڽ� ��ü�� ���� ����ȯ�� ���� �ٽ� �ڽ� ��ҷ� ��ȯ
		method1(pA);
		method2(pA);
		
		//pB�� �׳� �θ���.
		Parent pB = new Parent();
		//�θ� ��Ҹ� �ڽ� ��ҷ� ���� �� ��ȯ
		method1(pB);
		method2(pB);
	}

}
